package com.frugalbin.common.dto.request.authentication;

import java.io.Serializable;

import com.frugalbin.common.dto.response.authentication.ErrorResponse;

public class LoginResponseDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public LoginResponseDto(String token) {
		this.token = token;
	}
	
	public LoginResponseDto(ErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
	}
	
	public String token;
	public ErrorResponse errorResponse;
	
}
