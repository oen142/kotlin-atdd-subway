package com.wani.atdd.auth.application.provider

import com.wani.atdd.auth.domain.AuthenticationToken

interface AuthenticationManager {

    fun authenticate(authenticationToken : AuthenticationToken)
}