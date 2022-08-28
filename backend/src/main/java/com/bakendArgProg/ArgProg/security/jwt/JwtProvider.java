package com.bakendArgProg.ArgProg.security.jwt;

import com.bakendArgProg.ArgProg.persistence.models.UserPrincipal;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.SignatureException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtProvider {
    private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

    @Value("${jwt.secret}")

    private String sercret;

    @Value("${jwt.expiration}")
    private Long expiration;

    public String generateToken(Authentication authentication) {
        UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

        return Jwts.builder().setSubject(userPrincipal.getEmail())
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + expiration*1000))
                .signWith(SignatureAlgorithm.ES512, sercret)
                .compact();
    }
    public String getEmailUserfromToken(String token) {
        return Jwts.parser().setSigningKey(sercret).parseClaimsJws(token)
                .getBody()
                .getSubject();

    }
    public boolean validateToken (String token) {
        try {
            Jwts.parser().setSigningKey(sercret).parseClaimsJws(token);
            return true;

        }catch (MalformedJwtException e) {
            logger.error("token  mal  formado");
        }catch (UnsupportedJwtException e) {
            logger.error("token  no soprtado");
        }catch (ExpiredJwtException e) {
            logger.error("token  expirado");
        }catch (IllegalArgumentException e) {
            logger.error("token  vacio");
        }catch (SignatureException e) {
            logger.error("token  mal  formado");
        }
        return false;
    }
}
