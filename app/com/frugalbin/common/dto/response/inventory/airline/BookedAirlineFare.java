package com.frugalbin.common.dto.response.inventory.airline;

public class BookedAirlineFare
{
	private double baseFare;
	private double otherCharges;
	private double total;

	public double getBaseFare()
	{
		return baseFare;
	}

	public void setBaseFare(double baseFare)
	{
		this.baseFare = baseFare;
	}

	public double getOtherCharges()
	{
		return otherCharges;
	}

	public void setOtherCharges(double otherCharges)
	{
		this.otherCharges = otherCharges;
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}
}
