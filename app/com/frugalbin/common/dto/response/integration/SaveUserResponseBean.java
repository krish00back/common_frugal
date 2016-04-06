package com.frugalbin.common.dto.response.integration;

public class SaveUserResponseBean
{
	private Boolean requestStatus;
	private String failureReason;
	private String requestId;

	public Boolean getRequestStatus()
	{
		return requestStatus;
	}

	public void setRequestStatus(Boolean requestStatus)
	{
		this.requestStatus = requestStatus;
	}

	public String getFailureReason()
	{
		return failureReason;
	}

	public void setFailureReason(String failureReason)
	{
		this.failureReason = failureReason;
	}

	public String getRequestId()
	{
		return requestId;
	}

	public void setRequestId(String requestId)
	{
		this.requestId = requestId;
	}
}
