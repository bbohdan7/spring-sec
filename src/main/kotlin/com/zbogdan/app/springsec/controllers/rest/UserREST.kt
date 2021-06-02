package com.zbogdan.app.springsec.controllers.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/users")
class UserREST {

    @GetMapping
    fun all(): ResponseEntity<String> = ResponseEntity.ok("It works!")

}