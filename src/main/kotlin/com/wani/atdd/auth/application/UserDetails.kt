package com.wani.atdd.auth.application

interface UserDetails {

    fun getPrincipal(): Any?

    fun getCredentials(): Any?

    fun checkCredentials(credentials: Any?): Boolean

}