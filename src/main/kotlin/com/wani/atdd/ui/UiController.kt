package com.wani.atdd.ui

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UiController {

    @PostMapping("/ui")
    fun post(@RequestBody uiRequest: UiRequest): ResponseEntity<UiResponse> {
        println("uiRequest.name = ${uiRequest.name}")
        println("uiRequest.name = ${uiRequest.age}")
        println("uiRequest.name = ${uiRequest.date}")
        println("uiRequest.name = ${uiRequest.dateTime}")
        val response = uiRequest.toResponse()
        println("response.name = ${response.name}")
        println("response.name = ${response.age}")
        println("response.name = ${response.date}")
        println("response.name = ${response.dateTime}")

        return ResponseEntity.ok().body(
            response
        )
    }

}