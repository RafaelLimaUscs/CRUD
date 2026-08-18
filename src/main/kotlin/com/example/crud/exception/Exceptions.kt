package com.example.crud.exception

class ResourceNotFoundException(message: String): RuntimeException(message)
class BusinessException(message: String): RuntimeException(message)
