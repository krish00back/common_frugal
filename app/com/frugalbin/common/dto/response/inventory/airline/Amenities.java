package com.frugalbin.common.dto.response.inventory.airline;

public class Amenities
{
	private Boolean meals = true;
	private Boolean callSupport = true;
	private Boolean baggage = true;

	public Boolean getMeals()
	{
		return meals;
	}

	public void setMeals(Boolean meals)
	{
		this.meals = meals;
	}

	public Boolean getCallSupport()
	{
		return callSupport;
	}

	public void setCallSupport(Boolean callSupport)
	{
		this.callSupport = callSupport;
	}

	public Boolean getBaggage()
	{
		return baggage;
	}

	public void setBaggage(Boolean baggage)
	{
		this.baggage = baggage;
	}
}
