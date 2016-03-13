package com.frugalbin.common.dto.request.authentication;

import java.io.Serializable;

public class AddressRequestDto implements Serializable {

	private static final long serialVersionUID = 1L;

	public String token;
	public String addressHeading;
	public String pincode;
	public String address;
	public String landmark;
	public String phoneNo;
	public String city;
	public String state;
	public String country;

}
