package com.wani.atdd

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Component

@SpringBootApplication
class KotlinAtddSubwayApplication

fun main(args: Array<String>) {
    runApplication<KotlinAtddSubwayApplication>(*args)
}

@Component
class KotlinApiRunner(

    @Value("\${jwt.sign-key}")
    private val str: String
) : ApplicationRunner{
    override fun run(args: ApplicationArguments?) {
        println("str = ${str}")
    }

}