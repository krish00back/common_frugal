package com.frugalbin.common.dto.request.integration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.slf4j.LoggerFactory;

import com.frugalbin.common.enums.UserRequestStatus;

public class SaveUserRequestBean
{
	private String from;
	private String to;
	private Date departureDate;
	private Date returnDate;
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
		LoggerFactory.getLogger(SaveUserRequestBean.class).info("departureDatte: " + departureDate);
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(departureDate);
		DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		TimeZone obj = TimeZone.getTimeZone("UTC");
		formatter.setTimeZone(obj);
		System.out.println("Local:: " +calendar.getTime());
		System.out.println("CST:: "+ formatter.format(calendar.getTime()));

		
//		calendar.setTime(departureDate);
//        TimeZone fromTimeZone = calendar.getTimeZone();
//        TimeZone toTimeZone = TimeZone.getTimeZone("UTC");
//        
//        calendar.setTimeZone(toTimeZone);
        
        LoggerFactory.getLogger(SaveUserRequestBean.class).info("departureDatte: " + calendar.getTime());
		this.departureDate = calendar.getTime();
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

	public Date getReturnDate()
	{
		return returnDate;
	}

	public void setReturnDate(Date returnDate)
	{
		this.returnDate = returnDate;
	}

	@Override
	public String toString()
	{
		return "UserRequest -> From: " + from + ", to: " + to + ", departing: " + departureDate + ", return: "
				+ returnDate + ", passengers: [" + passengers + "], userDetails: [" + userDetails + "], pnr: " + pnr;
	}
}
