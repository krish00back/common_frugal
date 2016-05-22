package com.frugalbin.common.dto.request.inventory.airline;

import com.frugalbin.common.enums.UserRequestStatus;

public class UpdateUserRequest
{
	private String txnId;
	private UserRequestStatus status;

	public String getTxnId()
	{
		return txnId;
	}

	public void setTxnId(String txnId)
	{
		this.txnId = txnId;
	}

	public UserRequestStatus getStatus()
	{
		return status;
	}

	public void setStatus(UserRequestStatus status)
	{
		this.status = status;
	}
}
