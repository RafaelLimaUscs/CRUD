package com.example.crud.dto

import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotBlank
import java.math.BigDecimal

data class ProductDto(
    val id: Long? = null,

    @field:NotBlank(message = "Nome é obrigatório")
    val name: String,

    @field:DecimalMin(value = "0.0", inclusive = true, message = "Preço não pode ser negativo")
    val price: BigDecimal,

    @field:Min(value = 0, message = "Estoque não pode ser negativo")
    val stock: Int
)
