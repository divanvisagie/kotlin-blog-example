package com.divanvisagie.blog

import com.fasterxml.jackson.databind.util.JSONPObject
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HtmlController {

    @GetMapping("/")
    fun blog(model: Model) : String {
        model["title"] = "Blog"
        return "blog"
    }
}

