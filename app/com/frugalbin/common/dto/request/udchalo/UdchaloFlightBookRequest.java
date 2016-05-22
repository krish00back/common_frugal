package com.frugalbin.common.dto.request.udchalo;

public class UdchaloFlightBookRequest
{
	private String bookingId;
	private String token;

	public String getBookingId()
	{
		return bookingId;
	}

	public void setBookingId(String bookingId)
	{
		this.bookingId = bookingId;
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
