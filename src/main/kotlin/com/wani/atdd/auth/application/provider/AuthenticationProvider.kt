package com.wani.atdd.auth.application.provider

import com.wani.atdd.auth.application.UserDetails
import com.wani.atdd.auth.application.UserDetailsService
import com.wani.atdd.auth.application.handler.AuthenticationException
import com.wani.atdd.auth.domain.AuthenticationToken

class AuthenticationProvider(
    val userDetailsService: UserDetailsService
) : AuthenticationManager {

    override fun authenticate(authenticationToken: AuthenticationToken) {
        val principal = authenticationToken.principal
        val userDetails: UserDetails = userDetailsService.loadUserByUsername(principal)
        checkAuthentication(userDetails, authenticationToken)
    }

    private fun checkAuthentication(
        userDetails: UserDetails?,
        authenticationToken: AuthenticationToken?
    ) {
        if (userDetails == null) {
            throw AuthenticationException()
        }

        if (!userDetails.checkCredentials(authenticationToken?.credentials)) {
            throw AuthenticationException()
        }
    }
}