package com.wani.atdd.ui

import java.time.LocalDate
import java.time.LocalDateTime

data class UiRequest(
    val name: String,
    val age: Int,
    val date: LocalDate,
    val dateTime: LocalDateTime
) {
    fun toResponse(): UiResponse {
        return UiResponse(name, age, date, dateTime)
    }

}
