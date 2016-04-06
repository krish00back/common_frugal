package com.frugalbin.common.dto.response.inventory.airline;


public class PriceCheckResponseBean
{
	private Boolean isSuccess;
	private Boolean isFareChanged;
	private String message;
	private Double pricePerPerson;
	private PriceCheckRequestBean priceCheckRequest;

	public Boolean getIsSuccess()
	{
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess)
	{
		this.isSuccess = isSuccess;
	}

	public Boolean getIsFareChanged()
	{
		return isFareChanged;
	}

	public void setIsFareChanged(Boolean isFareChanged)
	{
		this.isFareChanged = isFareChanged;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public Double getPricePerPerson()
	{
		return pricePerPerson;
	}

	public void setPricePerPerson(Double pricePerPerson)
	{
		this.pricePerPerson = pricePerPerson;
	}

	public PriceCheckRequestBean getPriceCheckRequest()
	{
		return priceCheckRequest;
	}

	public void setPriceCheckRequest(PriceCheckRequestBean priceCheckRequest)
	{
		this.priceCheckRequest = priceCheckRequest;
	}
}
