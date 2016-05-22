package com.frugalbin.common.dto.request.inventory.airline;

public class FlightBookingRequest
{
	private String bookingId;
	private String requestId;

	public String getBookingId()
	{
		return bookingId;
	}

	public void setBookingId(String bookingId)
	{
		this.bookingId = bookingId;
	}

	public String getRequestId()
	{
		return requestId;
	}

	public void setRequestId(String requestId)
	{
		this.requestId = requestId;
	}
}
