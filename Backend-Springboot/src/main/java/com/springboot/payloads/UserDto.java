package com.springboot.payloads;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserDto {
	
	private int id;
	private String email;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", email=" + email + ", name=" + name + ", password=" + password + "]";
	}
	public UserDto() {
		super();
		
	}
	
	
	
}