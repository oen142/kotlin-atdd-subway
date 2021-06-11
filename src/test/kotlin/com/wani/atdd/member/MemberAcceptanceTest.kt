package com.wani.atdd.member

import com.wani.atdd.AcceptanceTest
import org.junit.jupiter.api.Test

class MemberAcceptanceTest : AcceptanceTest() {

    companion object {
        val EMAIL = "email@email.com"
        val PASSWORD = "password"
        val NEW_EMAIL = "newemail@email.com"
        val NEW_PASSWORD = "newpassword"
        val AGE = 21
        val NEW_AGE = 22
    }

    @Test
    fun `createMember`() {
        val 로그인되어있음 = MemberSteps.로그인_되어_있음(EMAIL, PASSWORD)
    }
}