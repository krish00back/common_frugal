package com.frugalbin.common.dto.request.inventory.airline;

import java.text.SimpleDateFormat;

import com.frugalbin.common.enums.Gender;

public class PassengerDetailsBean
{
	private static final SimpleDateFormat formatter = new SimpleDateFormat("");

	private String _id;
	private String birthDate;
	private String firstName;
	private Gender gender;
	private String lastName;
	private BookingPassengerType passengerType;
	private String eticket;

	public String get_id()
	{
		return _id;
	}


	public void set_id(String _id)
	{
		this._id = _id;
	}


	public String getEticket()
	{
		return eticket;
	}


	public void setEticket(String eticket)
	{
		this.eticket = eticket;
	}

	public String getBirthDate()
	{
		return birthDate;
	}

	public void setBirthDate(String birthDate)
	{
		this.birthDate = birthDate;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}

	public Gender getGender()
	{
		return gender;
	}

	public void setGender(Gender gender)
	{
		this.gender = gender;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public BookingPassengerType getPassengerType()
	{
		return passengerType;
	}

	public void setPassengerType(BookingPassengerType passengerType)
	{
		this.passengerType = passengerType;
	}
}
