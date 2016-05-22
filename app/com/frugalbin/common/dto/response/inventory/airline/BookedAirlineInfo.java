package com.frugalbin.common.dto.response.inventory.airline;

import java.util.Date;

public class BookedAirlineInfo
{
	private String id;
	private String flightNumber;
	private Date departureTime;
	private Date arrivalTime;
	private String origin;
	private String destination;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getFlightNumber()
	{
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	public Date getDepartureTime()
	{
		return departureTime;
	}

	public void setDepartureTime(Date departureTime)
	{
		this.departureTime = departureTime;
	}

	public Date getArrivalTime()
	{
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime)
	{
		this.arrivalTime = arrivalTime;
	}

	public String getOrigin()
	{
		return origin;
	}

	public void setOrigin(String origin)
	{
		this.origin = origin;
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}
}
