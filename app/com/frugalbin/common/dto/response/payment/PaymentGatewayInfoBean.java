package com.frugalbin.common.dto.response.payment;


public class PaymentGatewayInfoBean
{

	public PaymentGatewayInfoBean()
	{
	}

	public PaymentGatewayInfoBean(String pgId, String pgName, String pgUrl, String userName, String password,
			String token, String status, String callbackUrl)
	{
		this.pgId = pgId;
		this.pgName = pgName;
		this.pgUrl = pgUrl;
		this.userName = userName;
		this.password = password;
		this.token = token;
		this.status = status;
		this.callbackUrl = callbackUrl;
	}

	public String pgId;
	public String pgName;
	public String pgUrl;
	public String userName;
	public String password;
	public String token;
	public String status;
	public String callbackUrl;

}
