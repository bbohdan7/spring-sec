package com.zbogdan.app.springsec.services

import com.zbogdan.app.springsec.models.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Service

@Service
interface UserService : CrudRepository<User, Int>