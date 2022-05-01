package com.github.gitpodtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GitpodTestApplication

fun main(args: Array<String>) {
	runApplication<GitpodTestApplication>(*args)
}
