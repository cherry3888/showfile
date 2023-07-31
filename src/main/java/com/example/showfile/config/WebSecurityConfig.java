package com.example.showfile.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests(auth -> auth.antMatchers("/**").permitAll())
                .csrf().disable()
                .cors()
                .and()
                .headers(headers -> headers.contentTypeOptions(contentTypeOptions -> contentTypeOptions.disable()));
    }

}
