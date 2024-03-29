//package ru.den.roscosmostz.security;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.oauth2.jwt.Jwt;
//
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//public class KeycloakRoleConverter implements Converter<Jwt, Collection<GrantedAuthority>> {
//
//    @Override
//    @SuppressWarnings("unchecked")
//    public Collection<GrantedAuthority> convert(Jwt jwt) {
//        Map<String, Object> realmAccess = Optional.ofNullable(jwt.getClaims().get("realm_access"))
//                .map(access -> (Map<String, Object>) access)
//                .orElse(Collections.emptyMap());
//
//        return ((List<String>) realmAccess.getOrDefault("roles", Collections.emptyList()))
//                .stream()
//                .map(roleName -> "ROLE_" + roleName)
//                .map(SimpleGrantedAuthority::new)
//                .collect(Collectors.toList());
//    }
//}
