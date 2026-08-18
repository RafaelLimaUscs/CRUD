package com.example.crud.dto

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

data class UserDto(
    val id: Long? = null,

    @field:NotBlank(message = "Nome é obrigatório")
    val name: String,

    @field:Email(message = "Email inválido")
    @field:NotBlank(message = "Email é obrigatório")
    val email: String
)
