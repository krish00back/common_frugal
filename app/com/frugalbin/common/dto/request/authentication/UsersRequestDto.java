package com.frugalbin.common.dto.request.authentication;

import java.io.Serializable;

public class UsersRequestDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsersRequestDto() {}
	
	public UsersRequestDto(String userType, String name, String password, String email, String phoneNo) {
		this.userType = userType;
		this.name = name;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	public String userType;
	public String name;
	public String password;
	public String email;
	public String phoneNo;
}
