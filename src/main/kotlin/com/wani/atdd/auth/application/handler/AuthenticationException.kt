package com.wani.atdd.auth.application.handler

import java.lang.RuntimeException

class AuthenticationException : RuntimeException(){
    override val message: String?
        get() = super.message
}
