package com.frugalbin.common.dto.response.inventory.airline;

import java.util.List;

import com.frugalbin.common.dto.response.udchalo.FaresBean;
import com.frugalbin.common.dto.response.udchalo.LegBean;

public class Booking
{
	private List<LegBean> legs;
	private FaresBean fare;

	public List<LegBean> getLegs()
	{
		return legs;
	}

	public void setLegs(List<LegBean> legs)
	{
		this.legs = legs;
	}

	public FaresBean getFare()
	{
		return fare;
	}

	public void setFare(FaresBean fare)
	{
		this.fare = fare;
	}
}
