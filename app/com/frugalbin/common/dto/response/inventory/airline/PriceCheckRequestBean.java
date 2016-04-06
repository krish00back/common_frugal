package com.frugalbin.common.dto.response.inventory.airline;

public class PriceCheckRequestBean
{
	private String searchId;
	private Booking booking;

	public String getSearchId()
	{
		return searchId;
	}

	public void setSearchId(String searchId)
	{
		this.searchId = searchId;
	}

	public Booking getBooking()
	{
		return booking;
	}

	public void setBooking(Booking booking)
	{
		this.booking = booking;
	}
}
