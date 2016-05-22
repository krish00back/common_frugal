package com.frugalbin.common.dto.response.inventory.airline;

public class SaveBookingResponseBean
{
	private String bookingId;
	private Boolean success;
	private String failureMsg;

	public String getBookingId()
	{
		return bookingId;
	}

	public void setBookingId(String bookingId)
	{
		this.bookingId = bookingId;
	}

	public Boolean getSuccess()
	{
		return success;
	}

	public void setSuccess(Boolean success)
	{
		this.success = success;
	}

	public String getFailureMsg()
	{
		return failureMsg;
	}

	public void setFailureMsg(String failureMsg)
	{
		this.failureMsg = failureMsg;
	}
}
