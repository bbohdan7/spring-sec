package com.zbogdan.app.springsec.services

import com.zbogdan.app.springsec.models.User
import org.springframework.data.repository.CrudRepository


interface UserService : CrudRepository<User, Int>