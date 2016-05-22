package com.frugalbin.common.dto.response.integration;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.frugalbin.common.dto.request.integration.SaveUserRequestBean;
import com.frugalbin.common.dto.response.inventory.airline.CarrierBean;
import com.frugalbin.common.dto.response.inventory.airline.CityBean;
import com.frugalbin.common.dto.response.inventory.airline.MarketFlightDetailsBean;

public class FlightSearchResponseBean
{
	private FlightSearchStatus status;

	private String searchId;
	private Map<String, CityBean> cities;
	private String fromCity;
	private String toCity;
	private Map<String, CarrierBean> carriers;
	private Date departDate;
	private Date returnDate;
	private SaveUserRequestBean searchRequest;
	private List<MarketFlightDetailsBean> marketFlights;

	public FlightSearchStatus getStatus()
	{
		return status;
	}

	public void setStatus(FlightSearchStatus status)
	{
		this.status = status;
	}

	public String getSearchId()
	{
		return searchId;
	}

	public void setSearchId(String searchId)
	{
		this.searchId = searchId;
	}

	public Map<String, CityBean> getCities()
	{
		return cities;
	}

	public void setCities(Map<String, CityBean> cities)
	{
		this.cities = cities;
	}

	public String getFromCity()
	{
		return fromCity;
	}

	public void setFromCity(String fromCity)
	{
		this.fromCity = fromCity;
	}

	public String getToCity()
	{
		return toCity;
	}

	public void setToCity(String toCity)
	{
		this.toCity = toCity;
	}

	public Map<String, CarrierBean> getCarriers()
	{
		return carriers;
	}

	public void setCarriers(Map<String, CarrierBean> carriers)
	{
		this.carriers = carriers;
	}

	public Date getDepartDate()
	{
		return departDate;
	}

	public void setDepartDate(Date departDate)
	{
		this.departDate = departDate;
	}

	public Date getReturnDate()
	{
		return returnDate;
	}

	public void setReturnDate(Date returnDate)
	{
		this.returnDate = returnDate;
	}

	public SaveUserRequestBean getSearchRequest()
	{
		return searchRequest;
	}

	public void setSearchRequest(SaveUserRequestBean searchRequest)
	{
		this.searchRequest = searchRequest;
	}

	public List<MarketFlightDetailsBean> getMarketFlights()
	{
		return marketFlights;
	}

	public void setMarketFlights(List<MarketFlightDetailsBean> marketFlights)
	{
		this.marketFlights = marketFlights;
	}

	@Override
	public String toString()
	{
		return "FlightName: " + marketFlights.get(0).getCarrierId() + "departDate: "
				+ marketFlights.get(0).getDepartTime() + ", arrivalDate: " + marketFlights.get(0).getArrivalTime();
	}
}
