package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@RestController
class DemoApplication

fun main(args: Array<String>) {
	runApplication<DemoApplication>(*args)
}

@GetMapping("/devs13")
  fun demo(model: Model): String {
    model["title"] = "Blog"
    return "Usando Kotlin com Spring Boot"
  }