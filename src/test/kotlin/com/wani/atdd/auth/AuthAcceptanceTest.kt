package com.wani.atdd.auth

import com.wani.atdd.AcceptanceTest
import com.wani.atdd.utils.DatabaseCleanup
import io.restassured.response.ExtractableResponse
import io.restassured.response.Response
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class AuthAcceptanceTest private constructor() :
    AcceptanceTest() {
    @DisplayName("Session 로그인 후 내 정보 조회")
    @Test
    fun myInfoWithSession() {
    }


    companion object {
        private const val EMAIL = "email@email.com"
        private const val PASSWORD = "password"
        private const val AGE = 20
    }
}
