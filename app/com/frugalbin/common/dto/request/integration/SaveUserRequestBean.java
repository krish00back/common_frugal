package com.frugalbin.common.dto.request.integration;

import java.util.Date;

public class SaveUserRequestBean
{
	private String from;
	private String to;
	private Date departureDate;
	private PassengersCountBean passengers;
	private UserDetailsBean userDetails;
	private String pnr;

	public String getFrom()
	{
		return from;
	}

	public void setFrom(String from)
	{
		this.from = from;
	}

	public String getTo()
	{
		return to;
	}

	public void setTo(String to)
	{
		this.to = to;
	}

	public Date getDepartureDate()
	{
		return departureDate;
	}

	public void setDepartureDate(Date departureDate)
	{
		this.departureDate = departureDate;
	}

	public PassengersCountBean getPassengers()
	{
		return passengers;
	}

	public void setPassengers(PassengersCountBean passengers)
	{
		this.passengers = passengers;
	}

	public UserDetailsBean getUserDetails()
	{
		return userDetails;
	}

	public void setUserDetails(UserDetailsBean userDetails)
	{
		this.userDetails = userDetails;
	}

	public String getPnr()
	{
		return pnr;
	}

	public void setPnr(String pnr)
	{
		this.pnr = pnr;
	}
}
