package com.github.gitpodtest.api

import com.github.gitpodtest.domain.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController(value = "api/v1/hello")
class HelloResource(private val helloService: HelloService) {

    @GetMapping
    fun hello() = helloService.hello()
}