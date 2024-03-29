//package ru.den.roscosmostz.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.web.server.ServerHttpSecurity;
//import org.springframework.security.web.server.SecurityWebFilterChain;
//
//@Configuration
////@EnableWebSecurity
//public class SecurityConfig {
//
//    @Bean
//    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http) {
//        return http
//                .csrf(ServerHttpSecurity.CsrfSpec::disable)
//                .authorizeExchange(authExChange -> authExChange
//                        .pathMatchers("/actuator/prometheus").permitAll()
//                        .pathMatchers("/actuator/health").hasRole("ADMIN")
//                        .pathMatchers("/api/v1/**").authenticated()
//                        .anyExchange().authenticated())
//                .build();
//    }
//}
