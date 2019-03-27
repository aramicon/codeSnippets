package com.donakello.learn;

import java.util.Date;

public class SalaryEmployee extends BaseEmployee {
	private Double annualSalaryAmount;
	
	public SalaryEmployee(String name, String id, String email, Date dateStarted, Double salary) {
		super(name, id, email,dateStarted);
		this.setAnnualSalaryAmount(salary);		
	}

	public Double getAnnualSalaryAmount() {
		return annualSalaryAmount;
	}

	public void setAnnualSalaryAmount(Double annualSalaryAmount) {
		this.annualSalaryAmount = annualSalaryAmount;
	}


}
