package com.wani.atdd.auth.application.handler

import java.io.IOException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import kotlin.jvm.Throws

interface AuthenticationFailureHandler {
    @Throws(IOException::class)
    fun onAuthenticationFailure(request : HttpServletRequest , response : HttpServletResponse , failed : AuthenticationException)
}