package com.frugalbin.common.dto.response.payment;

public class PaymentGatewayResultBean {

	public String callbackUrl;
	public String paymentGatewayUrl;

	public PaymentGatewayResultBean(String callbackUrl, String paymentGatewayUrl) {
		this.callbackUrl = callbackUrl;
		this.paymentGatewayUrl = paymentGatewayUrl;
	}
}
