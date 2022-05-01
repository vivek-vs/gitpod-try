package com.github.gitpodtest.api

import com.github.gitpodtest.domain.HelloService
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class HelloResourceTest {
    private val helloService: HelloService = mockk()
    private val helloResource = HelloResource(helloService = helloService)

    @Test
    fun hello() {
        every { helloService.hello() } returns "Hello"

        val result = helloResource.hello()


        verify { helloService.hello() }
        assertEquals("Hello", result)

    }
}