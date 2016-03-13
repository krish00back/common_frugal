package com.frugalbin.common.dto.request.authentication;

import java.io.Serializable;

public class LoginRequestDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public String emailId;
	public String phoneNo;
	public String password;
	public String userType;
	public String name;
}
