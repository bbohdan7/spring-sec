package com.zbogdan.app.springsec.controllers

import com.zbogdan.app.springsec.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var srv: UserService

    @GetMapping
    fun all(model: Model): String = "index".apply {
        println("All users: ${srv.findAll()}")
        model.addAttribute("all", srv.findAll())
    }

}
