package com.zbogdan.app.springsec.controllers.rest

import com.zbogdan.app.springsec.models.User
import com.zbogdan.app.springsec.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/api/users")
class UserREST {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping
    fun all(): ResponseEntity<Iterable<User>> = ResponseEntity.ok(userService.findAll())

    @PostMapping
    fun create(@RequestBody user: User): ResponseEntity<String> {
        userService.save(user)
        return ResponseEntity.status(HttpStatus.CREATED).build()
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable("id") id: Int?): ResponseEntity<String> {
        val usr: Optional<User> = userService.findById(id!!)

        if (usr.isEmpty) {
            return ResponseEntity.notFound().build()
        }

        println("User to delete: ${usr.get()}")
        userService.delete(usr.get())

        return ResponseEntity.ok("Deleted!")
    }

}