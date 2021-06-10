package com.wani.atdd.auth.dto

data class TokenRequest(
    val email: String,
    val password: String
)