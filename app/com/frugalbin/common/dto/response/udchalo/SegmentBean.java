package com.frugalbin.common.dto.response.udchalo;

import java.util.Date;

import com.frugalbin.common.dto.response.inventory.airline.CityBean;
import com.frugalbin.common.enums.Cabins;

public class SegmentBean
{
	private String _id;
	// CityBean
	private String origin;

	// CityBean
	private String destination;
	private Date depart;
	private Date arrive;
	private int duration;
	private Cabins cabin;
	private String serviceClass;
	private String aircraft;
	private int mileage;
	private int stops;
	private String flightNumber;
	
	// airline code
	private String airline;
	
	private int layover;

	public String get_id()
	{
		return _id;
	}

	public void set_id(String _id)
	{
		this._id = _id;
	}

	public String getOrigin()
	{
		return origin;
	}

	public String getDestination()
	{
		return destination;
	}

	public Date getDepart()
	{
		return depart;
	}

	public Date getArrive()
	{
		return arrive;
	}

	public int getDuration()
	{
		return duration;
	}

	public Cabins getCabin()
	{
		return cabin;
	}

	public String getServiceClass()
	{
		return serviceClass;
	}

	public String getAircraft()
	{
		return aircraft;
	}

	public int getMileage()
	{
		return mileage;
	}

	public int getStops()
	{
		return stops;
	}

	public String getFlightNumber()
	{
		return flightNumber;
	}

	public String getAirline()
	{
		return airline;
	}

	public int getLayover()
	{
		return layover;
	}

	public void setOrigin(String origin)
	{
		this.origin = origin;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	public void setDepart(Date depart)
	{
		this.depart = depart;
	}

	public void setArrive(Date arrive)
	{
		this.arrive = arrive;
	}

	public void setDuration(int duration)
	{
		this.duration = duration;
	}

	public void setCabin(Cabins cabin)
	{
		this.cabin = cabin;
	}

	public void setServiceClass(String serviceClass)
	{
		this.serviceClass = serviceClass;
	}

	public void setAircraft(String aircraft)
	{
		this.aircraft = aircraft;
	}

	public void setMileage(int mileage)
	{
		this.mileage = mileage;
	}

	public void setStops(int stops)
	{
		this.stops = stops;
	}

	public void setFlightNumber(String flightNumber)
	{
		this.flightNumber = flightNumber;
	}

	public void setAirline(String airline)
	{
		this.airline = airline;
	}

	public void setLayover(int layover)
	{
		this.layover = layover;
	}
}
