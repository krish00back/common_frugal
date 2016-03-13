package com.frugalbin.common.dto.response.inventory.airline;


public class CityBean
{
	private Long cityId;
	private String cityName;

	public CityBean(Long cityId, String cityName)
	{
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public Long getCityId()
	{
		return cityId;
	}

	public void setCityId(Long cityId)
	{
		this.cityId = cityId;
	}

	public String getCityName()
	{
		return cityName;
	}

	public void setCityName(String cityName)
	{
		this.cityName = cityName;
	}
}
