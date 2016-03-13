package com.frugalbin.common.dto.response.payment;

import java.util.Date;

public class PaymentsBean
{

	public PaymentsBean(Long paymentId, Date dateTime, String status, Long pgReferenceId)
	{
		this.paymentId = paymentId;
		this.dateTime = dateTime;
		this.status = status;
		this.pgReferenceId = pgReferenceId;
	}

	public Long paymentId;
	public Date dateTime;
	public String status;
	public Long pgReferenceId;

}
