package com.frugalbin.common.dto.response.communication;

public class SuccessStatusResponse
{
	private Boolean isSuccess;
	private String failureMsg;

	public Boolean getIsSuccess()
	{
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess)
	{
		this.isSuccess = isSuccess;
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
