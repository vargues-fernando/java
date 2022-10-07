package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

  @GetMapping("/devs13")
  fun blog(model: Model): String {
    model["title"] = "EndPoint entre SpringBoot e Kotlin"
    return "blog"
  }

}
