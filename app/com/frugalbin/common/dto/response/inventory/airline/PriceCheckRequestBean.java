package com.frugalbin.common.dto.response.inventory.airline;

public class PriceCheckRequestBean
{
	private String searchId;
	private PriceCheckReqBooking booking;
	private String token;

	public String getSearchId()
	{
		return searchId;
	}

	public void setSearchId(String searchId)
	{
		this.searchId = searchId;
	}

	public PriceCheckReqBooking getBooking()
	{
		return booking;
	}

	public void setBooking(PriceCheckReqBooking booking)
	{
		this.booking = booking;
	}

	public String getToken()
	{
		return token;
	}

	public void setToken(String token)
	{
		this.token = token;
	}
}
