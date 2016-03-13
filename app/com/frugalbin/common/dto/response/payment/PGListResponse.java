package com.frugalbin.common.dto.response.payment;

import java.util.List;

public class PGListResponse {

	public PGListResponse(List<PaymentGatewayInfoBean> paymentGateways) {
		this.paymentGateways = paymentGateways;
	}
	
	public List<PaymentGatewayInfoBean> paymentGateways;
	
}
