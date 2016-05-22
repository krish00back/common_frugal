package com.frugalbin.common.dto.response.inventory.airline;

public class CarrierBean
{
	private String id;
	private String name;
	private Amenities amenities = new Amenities();

	public CarrierBean()
	{
	}

	public CarrierBean(String id, String name)
	{
		this.id = id;
		this.name = name;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Amenities getAmenities()
	{
		return amenities;
	}

	public void setAmenities(Amenities amenities)
	{
		this.amenities = amenities;
	}
}
