package com.wani.atdd

import com.wani.atdd.utils.DatabaseCleanup
import io.restassured.RestAssured
import io.restassured.builder.RequestSpecBuilder
import io.restassured.specification.RequestSpecification
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.web.server.LocalServerPort
import org.springframework.restdocs.RestDocumentationContextProvider
import org.springframework.restdocs.RestDocumentationExtension
import org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint
import org.springframework.restdocs.restassured3.RestAssuredRestDocumentation.document
import org.springframework.restdocs.restassured3.RestAssuredRestDocumentation.documentationConfiguration
import org.springframework.restdocs.snippet.Snippet
import org.springframework.test.context.ActiveProfiles
import java.util.*


@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ExtendWith(RestDocumentationExtension::class)
class Documentation(

    @LocalServerPort
    var port: Int,
    private val databaseCleanUp: DatabaseCleanup,
    protected var spec: RequestSpecification
) {

    @BeforeEach
    fun setUp(restDocumentation: RestDocumentationContextProvider) {
        RestAssured.port = port

        databaseCleanUp.execute()
        this.spec = RequestSpecBuilder()
            .addFilter(
                documentationConfiguration(restDocumentation).operationPreprocessors()
                    .withRequestDefaults(prettyPrint())
                    .withResponseDefaults(prettyPrint())
            )
            .build()
    }


    fun given(vararg snippets: Snippet?): RequestSpecification? {
        return RestAssured
            .given(spec)
            .filter(document("{method-name}", *snippets))
    }
}