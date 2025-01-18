package com.oauth2.oauth2_spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(request -> {
            request.requestMatchers("/", "/login")
                    .permitAll()
                    .anyRequest()
                    .authenticated();
        }).oauth2Login(oauth2Login -> {
            oauth2Login.loginPage("/login")
                    .defaultSuccessUrl("/home",true);
        });

        return http.build();

    }

}
