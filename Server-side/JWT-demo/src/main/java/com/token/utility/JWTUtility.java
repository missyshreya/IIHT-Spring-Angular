package com.token.utility;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import java.util.function.*;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtility implements Serializable {

	private static final long serialVersionUID= 234234524524L;
	
	private static final long JWT_TOKEN_VALIDITY=5*60*60;
	
	private String secretKey="Shreya";
	
	//to retrieve username from JWT token
	public String getUsernameFromToken(String token) {
		return getClaimFromToken(token, Claims::getSubject);
	}
	
	//to retrieve the expiration date from the token
	public Date getExpirationDateFromToken(String token ) {
		return getClaimFromToken(token, Claims::getExpiration);
	}
	
	private <T> T getClaimFromToken(String token,Function<Claims, T> claimsResolver) {
		final Claims claims=getAllClaimsFromTokenClaims(token);
		return claimsResolver.apply(claims);
	}
	
	//for retrieving any information from the token we will need for the secret key
	private Claims getAllClaimsFromTokenClaims(String token) {
		return Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token).getBody();
	}
	
	//method to check if the token is expired
	private Boolean isTokenExpired(String token) {
		final Date expiration= getExpirationDateFromToken(token);
		return expiration.before(new Date());
	}
	
	//generate token for user
	public String generateToken(UserDetails userDetails) {
		Map<String, Object> claims =  new HashMap<>();
		return doGenerateToken(claims, userDetails.getUsername());
	}
	
	private String doGenerateToken(Map<String, Object> claims, String subject) {
		return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+ JWT_TOKEN_VALIDITY * 1000))
				.signWith(SignatureAlgorithm.HS512, secretKey).compact();
	}
	
	//vallidate the token
	public Boolean validateToken(String token, UserDetails userDetails) {
		final String username = getUsernameFromToken(token);
		return(username.equals(userDetails.getUsername()) && !isTokenExpired(token));
	}
}
