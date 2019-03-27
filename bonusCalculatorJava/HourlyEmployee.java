package com.donakello.learn;

import java.util.Date;

public class HourlyEmployee extends BaseEmployee{
	private double hourlyrate;
	private double contractHoursPerWeek;

	
	public HourlyEmployee(String name, String id, String email, Date dateStarted, double rate,double contractHoursPerWeek) {
		super(name, id, email,dateStarted);
		this.hourlyrate = rate;
		this.setContractHoursPerWeek(contractHoursPerWeek); 
	}


	public double getHourlyrate() {
		return hourlyrate;
	}


	public void setHourlyrate(double hourlyrate) {
		this.hourlyrate = hourlyrate;
	}


	public double getContractHoursPerWeek() {
		return contractHoursPerWeek;
	}


	public void setContractHoursPerWeek(double contractHoursPerWeek) {
		this.contractHoursPerWeek = contractHoursPerWeek;
	}

	
	

}
