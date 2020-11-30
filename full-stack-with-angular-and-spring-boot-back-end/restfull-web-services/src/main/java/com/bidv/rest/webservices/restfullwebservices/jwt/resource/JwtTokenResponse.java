package com.bidv.rest.webservices.restfullwebservices.jwt.resource;

import java.io.Serializable;
import java.util.List;

public class JwtTokenResponse implements Serializable {

	private static final long serialVersionUID = 8317676219297719109L;

	private final String token;

	private final List<String> roles;

	

	public JwtTokenResponse(String token, List<String> roles) {
		super();
		this.token = token;
		this.roles = roles;
	}

	public String getToken() {
		return this.token;
	}

	public List<String> getRoles() {
		return roles;
	}

	
}