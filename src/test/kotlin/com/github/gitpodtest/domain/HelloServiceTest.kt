package com.github.gitpodtest.domain

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HelloServiceTest {
    @Test
    fun hello() {
        val helloService = HelloService()
        val result = helloService.hello()
        assertEquals("Hello", result)
    }
}