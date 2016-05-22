package com.frugalbin.common.dto.request.communication;

public class SendFrugalbinMessageRequest
{
	private String fromEmailAddr;
	private String subject;
	private String message;
	private String fromName;

	public String getFromEmailAddr()
	{
		return fromEmailAddr;
	}

	public void setFromEmailAddr(String fromEmailAddr)
	{
		this.fromEmailAddr = fromEmailAddr;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getFromName()
	{
		return fromName;
	}

	public void setFromName(String fromName)
	{
		this.fromName = fromName;
	}
}
