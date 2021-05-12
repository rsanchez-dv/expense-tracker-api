package com.workFromHome.expensetrackerapi.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
    @Override
    protected void configure(AuthenticationManagerBuilder auth)throws Exception{

        auth.inMemoryAuthentication()
                .withUser("Foo")
                .password("Foo")
                .roles("USER")
                .and()// Method chaining to add multiple users
                .withUser("Adam")
                .password("West")
                .roles("Admin");
    }
    @Bean
    public PasswordEncoder getPasswordEncoder(){
        // Don't do this in a production env
        return NoOpPasswordEncoder.getInstance();
    }
}