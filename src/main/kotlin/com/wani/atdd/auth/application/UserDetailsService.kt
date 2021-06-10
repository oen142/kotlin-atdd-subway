package com.wani.atdd.auth.application

interface UserDetailsService {

    fun loadUserByUsername(principal: String?) : UserDetails
}