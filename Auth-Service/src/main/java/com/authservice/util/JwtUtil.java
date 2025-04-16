package com.authservice.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.JwtException;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class JwtUtil {

    // Use a fallback secret key if the environment variable is not set
    private static final String SECRET = System.getenv("JWT_SECRET") != null ? System.getenv("JWT_SECRET") : "defaultSecretKeyForLocalDevelopment";
    private static final Key SECRET_KEY = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));

    // Generate token with custom claims and 10-hour expiration
    public String generateToken(String username, Map<String, Object> claims) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 hours
                .signWith(SECRET_KEY)
                .compact();
    }

    // Overloaded method for generating a token without custom claims
    public String generateToken(String username) {
        return generateToken(username, Map.of());
    }

    // Validate token and retrieve the username (subject)
    public String validateTokenAndRetrieveSubject(String token) throws JwtException {
        try {
            return Jwts.parserBuilder()
                    .setSigningKey(SECRET_KEY)
                    .build()
                    .parseClaimsJws(token)
                    .getBody()
                    .getSubject();
        } catch (JwtException e) {
            throw new JwtException("Invalid or expired JWT token");
        }
    }
}