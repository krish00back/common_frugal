package com.frugalbin.common.dto.response.inventory.airline;

import com.frugalbin.common.enums.Gender;
import com.frugalbin.common.enums.PassengerType;

public class BookedPassengers
{
	private String name;
	private PassengerType passengerType;
	private Gender gender;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public PassengerType getPassengerType()
	{
		return passengerType;
	}

	public void setPassengerType(PassengerType passengerType)
	{
		this.passengerType = passengerType;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}
}
