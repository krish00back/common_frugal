package com.frugalbin.common.dto.request.inventory.airline;

import com.frugalbin.common.enums.PassengerType;

public enum BookingPassengerType
{
	// Adult
	adult,
	// Infant
	infant;
	
	public PassengerType getPassengerType()
	{
		switch (this)
		{
			case adult:
				return PassengerType.ADT;
			case infant:
				return PassengerType.INF;
			default:
				return PassengerType.ADT;
			
		}
	}
}
