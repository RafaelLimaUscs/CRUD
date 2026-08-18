package com.example.crud.service

import com.example.crud.dto.ProductDto
import com.example.crud.exception.ResourceNotFoundException
import com.example.crud.model.Product
import com.example.crud.repository.ProductRepository
import org.springframework.stereotype.Service
import java.math.BigDecimal

@Service
class ProductService(private val repo: ProductRepository) {

    fun create(dto: ProductDto): Product {
        val product = Product(name = dto.name, price = dto.price, stock = dto.stock)
        return repo.save(product)
    }

    fun findAll(): List<Product> = repo.findAll()

    fun findById(id: Long): Product =
        repo.findById(id).orElseThrow { ResourceNotFoundException("Produto $id não encontrado") }

    fun update(id: Long, dto: ProductDto): Product {
        val p = findById(id)
        p.name = dto.name
        p.price = dto.price
        p.stock = dto.stock
        return repo.save(p)
    }

    fun delete(id: Long) {
        val p = findById(id)
        repo.delete(p)
    }
}
