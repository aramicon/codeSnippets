package com.donakello.learn;

import java.time.LocalDate;
import java.time.Year;
import java.time.ZoneId;
import java.util.Date;

public class BonusCalculator {
	
	public double calcuateBonus(HourlyEmployee hourlyEmployee) {
		
		double rate = hourlyEmployee.getHourlyrate();
		double hoursPerWeek = hourlyEmployee.getContractHoursPerWeek();
		Date dateStarted = hourlyEmployee.getDateStarted();
		System.out.println(dateStarted);
		double bonus = (hoursPerWeek/2)*rate;
		
		int years = yearsWorked(dateStarted);
		double yearsWorkedBonus;
		if (years < 1) {
			yearsWorkedBonus = 0;
		}
		else if (years < 2) {
			yearsWorkedBonus = 20;
		}
		else if (years < 5) {
			yearsWorkedBonus = 50;
		}
		else if (years < 10) {
			yearsWorkedBonus = 100;
		}
		else {
			yearsWorkedBonus = 150;
		}
		
		bonus = bonus + bonus*(yearsWorkedBonus/100);
		
		LocalDate localDate = dateStarted.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		if (isLeapYear(localDate.getYear())) {
			bonus = bonus + rate*8;
		}
		
		return Math.ceil(bonus);
	}
	public double calcuateBonus(SalaryEmployee salaryEmployee) {

		double salary = salaryEmployee.getAnnualSalaryAmount();
		
		Date dateStarted = salaryEmployee.getDateStarted();
		System.out.println(dateStarted);
		double bonus = (salary/52);
		
		int years = yearsWorked(dateStarted);
		double yearsWorkedBonus;
		if (years < 1) {
			yearsWorkedBonus = 0;
		}
		else if (years < 2) {
			yearsWorkedBonus = 20;
		}
		else if (years < 5) {
			yearsWorkedBonus = 50;
		}
		else if (years < 10) {
			yearsWorkedBonus = 100;
		}
		else {
			yearsWorkedBonus = 150;
		}
		System.out.println(bonus);
		System.out.println(yearsWorkedBonus);
		bonus = bonus + bonus*(yearsWorkedBonus/100);
		
		System.out.println(bonus);
		LocalDate localDate = dateStarted.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		
		if (isLeapYear(localDate.getYear())) {
			bonus = bonus + salary/52;
		}
		
		return Math.ceil(bonus);
	}
	
	public Boolean isLeapYear(int year) {
		Boolean res = false;
		if( year%4==0){
			res = true;
		}
		return res;
	}
		
	public int yearsWorked(Date dateStarted) {
		int currentYear = Year.now().getValue();
		LocalDate localDate = dateStarted.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();				
		return currentYear - localDate.getYear();
	}

}
