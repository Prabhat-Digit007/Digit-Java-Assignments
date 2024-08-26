package com.example.Day24.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(customer -> customer.disable())
                .authorizeHttpRequests(customer -> customer.anyRequest().authenticated())
                .formLogin(Customizer.withDefaults())
                        .httpBasic(Customizer.withDefaults())
                                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));


        return http.csrf(customizer -> customizer.disable()).
                authorizeHttpRequests(customer -> customer.anyRequest().authenticated()).
                httpBasic(Customizer.withDefaults()).
                sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();

    }

}
