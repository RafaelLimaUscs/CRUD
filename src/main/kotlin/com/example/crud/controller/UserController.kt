package com.example.crud.controller

import com.example.crud.dto.UserDto
import com.example.crud.model.User
import com.example.crud.service.UserService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val service: UserService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody dto: UserDto): User = service.create(dto)

    @GetMapping
    fun all(): List<User> = service.findAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): User = service.findById(id)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @Valid @RequestBody dto: UserDto): User = service.update(id, dto)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) = service.delete(id)
}
