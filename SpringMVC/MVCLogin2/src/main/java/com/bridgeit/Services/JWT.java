package com.bridgeit.Services;

import java.util.Date;

import org.apache.log4j.Logger;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWT {

	private final static Logger logger=Logger.getLogger(JWT.class);
	
	public static String getToken(String clientSecret) 
	
	{	
		String token;
		long currentmillis=System.currentTimeMillis();
		Date now=new Date(currentmillis);
		SignatureAlgorithm signaturealgorithm=SignatureAlgorithm.HS256;
		JwtBuilder builder=Jwts.builder().setId("12345")
				.setIssuedAt(now)
				.setSubject("JWT Token")
				.setIssuer("Aniketh's Tokens")
				.claim("Name", "Anibo")
				.claim("Location", "Hyderabad")
				.signWith(SignatureAlgorithm.HS256, clientSecret);
		
		long exptime=400000;
		if(exptime>=0)
		{
			long expmillis=currentmillis+exptime;
			Date expdate=new Date(expmillis);
			builder.setExpiration(expdate);	
		}
		token=builder.compact();
		logger.info(token);
		
		
		
		return token;
	}

}
