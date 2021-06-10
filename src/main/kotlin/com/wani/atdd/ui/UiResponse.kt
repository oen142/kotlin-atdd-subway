package com.wani.atdd.ui

import java.time.LocalDate
import java.time.LocalDateTime

data class UiResponse(
    val name: String,
    val age: Int,
    val date: LocalDate,
    val dateTime: LocalDateTime
) {

}
