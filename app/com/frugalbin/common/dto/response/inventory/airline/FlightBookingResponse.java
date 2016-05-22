package com.frugalbin.common.dto.response.inventory.airline;

import java.util.List;

public class FlightBookingResponse
{
	private Boolean isSuccess;
	private Boolean isFareChanged;
	private String failureMessage;

	private String transactionId;
	private List<BookedAirlineInfo> airline;
	private String bookingPnr;
	private BookedAirlineFare fare;
	private List<BookedPassengers> passengers;

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

	public String getFailureMessage()
	{
		return failureMessage;
	}

	public void setFailureMessage(String failureMessage)
	{
		this.failureMessage = failureMessage;
	}

	public String getTransactionId()
	{
		return transactionId;
	}

	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}

	public List<BookedAirlineInfo> getAirline()
	{
		return airline;
	}

	public void setAirline(List<BookedAirlineInfo> airline)
	{
		this.airline = airline;
	}

	public String getBookingPnr()
	{
		return bookingPnr;
	}

	public void setBookingPnr(String bookingPnr)
	{
		this.bookingPnr = bookingPnr;
	}

	public BookedAirlineFare getFare()
	{
		return fare;
	}

	public void setFare(BookedAirlineFare fare)
	{
		this.fare = fare;
	}

	public List<BookedPassengers> getPassengers()
	{
		return passengers;
	}

	public void setPassengers(List<BookedPassengers> passengers)
	{
		this.passengers = passengers;
	}
}
