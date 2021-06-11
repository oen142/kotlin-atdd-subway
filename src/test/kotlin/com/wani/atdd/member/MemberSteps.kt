package com.wani.atdd.member

import com.wani.atdd.auth.dto.TokenResponse
import io.restassured.RestAssured
import io.restassured.response.ExtractableResponse
import io.restassured.response.Response
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType

class MemberSteps {

    companion object {
        val USERNAME_FILED: String = "username"
        val PASSWORD_FIELD: String = "password"
        fun 로그인_되어_있음(email: String, password: String): TokenResponse? {
            val response: ExtractableResponse<Response> = this.로그인_요청(email, password)
            return response.`as`(TokenResponse::class.java)
        }

        private fun 로그인_요청(email: String, password: String): ExtractableResponse<Response> {
            val params = mutableMapOf<String, String>()
            params["email"] = email
            params["password"] = password

            return RestAssured.given().log().all()
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .body(params)
                .`when`().post("/login/token")
                .then().log().all()
                .statusCode(HttpStatus.OK.value()).extract()
        }

    }


    fun 회원_생성_요청(email: String, password: String, age: Int): ExtractableResponse<Response> {
        val params = mutableMapOf<String, String>()
        params["email"] = email
        params["password"] = password
        params["age"] = age.toString()

        return RestAssured
            .given().log().all()
            .contentType(MediaType.APPLICATION_JSON_VALUE)
            .body(params)
            .`when`().post("/members")
            .then().log().all()
            .extract()
    }

}