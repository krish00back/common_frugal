package com.frugalbin.common.dto.request.integration;

public class UserDetailsBean
{
	private String firstName;
	private String lastName;
	private Long userId;
	private String email;
	private String phoneno;

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public Long getUserId()
	{
		return userId;
	}

	public void setUserId(Long userId)
	{
		this.userId = userId;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getPhoneno()
	{
		return phoneno;
	}

	public void setPhoneno(String phoneno)
	{
		this.phoneno = phoneno;
	}
}
