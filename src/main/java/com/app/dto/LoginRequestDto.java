package com.app.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class LoginRequestDto {
	@NotBlank(message = "email cant be null")
	@Email(message = "invalid email format")
	private String email;
	@Length(min = 8,max = 12,message = "invalid password")
	private String password;
	public LoginRequestDto() {
		super();
	}
	public LoginRequestDto(
			@NotBlank(message = "email cant be null") @Email(message = "invalid email format") String email,
			@Length(min = 8, max = 12, message = "invalid password") String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginRequestDto [email=" + email + ", password=" + password + "]";
	}
	
	
}
