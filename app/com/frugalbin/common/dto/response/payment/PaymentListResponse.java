package com.frugalbin.common.dto.response.payment;

import java.util.List;

public class PaymentListResponse {

	public String token;
	public List<PaymentsBean> paymentsList;

	public PaymentListResponse(String token, List<PaymentsBean> paymentsList) {
		this.token = token;
		this.paymentsList = paymentsList;
	}
}
