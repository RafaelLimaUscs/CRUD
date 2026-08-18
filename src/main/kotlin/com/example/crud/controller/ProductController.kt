package com.example.crud.controller

import com.example.crud.dto.ProductDto
import com.example.crud.model.Product
import com.example.crud.service.ProductService
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/products")
class ProductController(private val service: ProductService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@Valid @RequestBody dto: ProductDto): Product = service.create(dto)

    @GetMapping
    fun all(): List<Product> = service.findAll()

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): Product = service.findById(id)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @Valid @RequestBody dto: ProductDto): Product = service.update(id, dto)

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) = service.delete(id)
}
