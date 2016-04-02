package com.frugalbin.common.rest.client;

public interface RestClientProtocolInterface
{
	public String getUrl();

	public RequestType getReqType();

	public String[] getParams();
	
	public String getName();
}
