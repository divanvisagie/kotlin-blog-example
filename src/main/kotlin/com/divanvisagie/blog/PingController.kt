package com.divanvisagie.blog

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


data class PongMessage(val content: String)

@RestController
class PingController {
    @GetMapping("/ping")
    fun ping(): PongMessage {
        return PongMessage("pong")
    }
}