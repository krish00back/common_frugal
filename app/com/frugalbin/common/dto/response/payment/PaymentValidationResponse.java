package com.frugalbin.common.dto.response.payment;

public class PaymentValidationResponse
{
	private boolean isValid;
	private String message;

	public boolean isValid()
	{
		return isValid;
	}

	public void setIsValid(boolean isValid)
	{
		this.isValid = isValid;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}
