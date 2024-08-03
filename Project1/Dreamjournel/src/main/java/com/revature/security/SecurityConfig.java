package com.revature.security;

import jakarta.servlet.Filter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


public class SecurityConfig extends WebSecurityConfiguration {
    private final JwtAuthenticationFilter jwtAuthenticationFIlter;

    public SecurityConfig(JwtAuthenticationFilter jwtAuthenticationFIlter) {
        this.jwtAuthenticationFIlter = jwtAuthenticationFIlter;
    }

    @Override
    protected void WebSecurityConfiguration::
    WebSecurityConfiguration::


    @Override

    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .requestMatchers("/users/login").permitAll()
                .anyRequest().authenticated();

        http.addFilterBefore(jwtAuthenticationFIlter, UsernamePasswordAuthenticationFilter.class);
    }
}
