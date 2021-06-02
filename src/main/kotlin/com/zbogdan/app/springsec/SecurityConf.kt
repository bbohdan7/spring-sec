package com.zbogdan.app.springsec

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.factory.PasswordEncoderFactories

@Configuration
@EnableWebSecurity
class SecurityConf : WebSecurityConfigurerAdapter() {
    override fun configure(auth: AuthenticationManagerBuilder) {
        auth.inMemoryAuthentication()
            .withUser("bogdan")
            .password(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123"))
            .authorities("USER")
    }

    override fun configure(web: WebSecurity) {
        web.ignoring().antMatchers("/users/**").antMatchers("/api/users/**")
    }

}