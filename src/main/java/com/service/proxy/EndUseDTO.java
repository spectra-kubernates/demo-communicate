package com.service.proxy;

import java.math.BigDecimal;

public class EndUseDTO {

	private Long id;

	//@Column(name = "GRACE_PERIOD_IN_DAYS", nullable = false)
	private Long gracePeriodInDays;

	//@Column(name = "GRACE_PERIOD_IN_MONTHS", nullable = false)
	private Long gracePeriodInMonths;

	//@Column(name = "GRACE_PERIOD_IN_YEARS", nullable = false)
	private Long gracePeriodInYears;

	//@Column(name = "TOTAL_LOAN_AMOUNT", precision = 20, scale = 2, nullable = false)
	private BigDecimal totalLoanAmount;
}
