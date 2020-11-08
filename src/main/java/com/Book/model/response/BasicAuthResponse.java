package com.Book.model.response;

import java.util.List;

public class BasicAuthResponse {
	private String token;
	private String type = "Basic";
	private String id;
	private String username;
	private String email;
	private List<String> roles;
	
	
	public BasicAuthResponse (String basicToken, String id, String username, String email, List<String> roles) {
		this.token=basicToken;
		this.id= id;
		this.username= username;
		this.email=email;
		this.roles = roles;
	}
	
	
	




	public String getBasicToken() {
		return token;
	}


	public void setBasicToken(String basicToken) {
		this.token = basicToken;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<String> getRoles() {
		return roles;
	}


	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
