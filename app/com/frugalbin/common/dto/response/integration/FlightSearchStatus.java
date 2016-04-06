package com.frugalbin.common.dto.response.integration;

public class FlightSearchStatus
{
	private Boolean isValid;
	private String invalidReason;

	public Boolean getIsValid()
	{
		return isValid;
	}

	public void setIsValid(Boolean isValid)
	{
		this.isValid = isValid;
	}

	public String getInvalidReason()
	{
		return invalidReason;
	}

	public void setInvalidReason(String invalidReason)
	{
		this.invalidReason = invalidReason;
	}
}
