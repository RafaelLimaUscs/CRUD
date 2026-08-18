package com.example.crud.service

import com.example.crud.dto.UserDto
import com.example.crud.exception.ResourceNotFoundException
import com.example.crud.model.User
import com.example.crud.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val repo: UserRepository) {

    fun create(dto: UserDto): User {
        val user = User(name = dto.name, email = dto.email)
        return repo.save(user)
    }

    fun findAll(): List<User> = repo.findAll()

    fun findById(id: Long): User =
        repo.findById(id).orElseThrow { ResourceNotFoundException("Usuário $id não encontrado") }

    fun update(id: Long, dto: UserDto): User {
        val user = findById(id)
        user.name = dto.name
        user.email = dto.email
        return repo.save(user)
    }

    fun delete(id: Long) {
        val user = findById(id)
        repo.delete(user)
    }
}
