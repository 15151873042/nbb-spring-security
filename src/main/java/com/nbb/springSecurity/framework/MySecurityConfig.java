package com.nbb.springSecurity.framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class MySecurityConfig {

    /**
     * 定义过滤器链以及认证规则
     */
    @Bean
    protected SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .authorizeRequests()
                .antMatchers("/index").permitAll()
                .antMatchers("/index2").permitAll()
                .anyRequest().authenticated();


        DefaultSecurityFilterChain securityFilterChain = httpSecurity.build();
        return securityFilterChain;
    }
}
