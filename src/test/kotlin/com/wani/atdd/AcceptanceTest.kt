package com.wani.atdd

import com.wani.atdd.utils.DatabaseCleanup
import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AcceptanceTest(
    @LocalServerPort
    val port: Int,

    @Autowired
    val databaseCleanup: DatabaseCleanup

) {

    @BeforeEach
    fun setUp() {
        RestAssured.port = port
        databaseCleanup.execute()
    }

    @Test
    fun `테스트`(){
        println("port = ${port}")

    }
}