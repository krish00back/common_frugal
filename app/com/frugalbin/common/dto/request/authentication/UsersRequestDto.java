package com.frugalbin.common.dto.request.authentication;

import java.io.Serializable;

public class UsersRequestDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsersRequestDto() {}
	
	public UsersRequestDto(String userType, String password, String email, String phoneNo, String firstName, String lastName) {
		this.userType = userType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	public String userType;
	public String firstName;
	public String lastName;
	public String password;
	public String email;
	public String phoneNo;
}
