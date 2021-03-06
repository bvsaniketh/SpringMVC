package com.bridgeit.Model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GoogleToken {
	 String access_token;
	 String token_type;
	 String expires_in;
	 String id_token;
	
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(String expires_in) {
		this.expires_in = expires_in;
	}
	public String getId_token() {
		return id_token;
	}
	public void setId_token(String id_token) {
		this.id_token = id_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	@Override
	public String toString() {
		return "GoogleToken [access_token=" + access_token + ", token_type=" + token_type + ", expires_in=" + expires_in
				+ ", id_token=" + id_token + "]";
	}
	

	
	
	 
	 
}

