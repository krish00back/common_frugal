package com.frugalbin.common.dto.response.integration;

import com.frugalbin.common.dto.request.payment.PaymentRequestDto;
import com.frugalbin.common.dto.response.inventory.airline.PriceCheckRequestBean;

public class BeginTransactionRequest
{
	private PriceCheckRequestBean priceCheckRequest;
	private PaymentRequestDto paymentUrlRequest;

	public PriceCheckRequestBean getPriceCheckRequest()
	{
		return priceCheckRequest;
	}

	public void setPriceCheckRequest(PriceCheckRequestBean priceCheckRequest)
	{
		this.priceCheckRequest = priceCheckRequest;
	}

	public PaymentRequestDto getPaymentUrlRequest()
	{
		return paymentUrlRequest;
	}

	public void setPaymentUrlRequest(PaymentRequestDto paymentUrlRequest)
	{
		this.paymentUrlRequest = paymentUrlRequest;
	}
}
