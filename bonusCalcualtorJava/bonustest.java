package com.donakello.learn;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class bonustest {
	
	BonusCalculator bonusCalculator;
	HourlyEmployee employee1;
	SalaryEmployee employee2;
	
	@BeforeEach
	public void setUp() throws Exception {
		bonusCalculator = new BonusCalculator();
		
	}

	@Test
	void testBasicBonusHourly() throws Exception {
		String sDate1="31/12/1997";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);	    
		employee1 = new HourlyEmployee("Bob","1234S","bob@bob.bob",date1,10.0,40);
		assertEquals(500,bonusCalculator.calcuateBonus(employee1));
	}
	@Test
	void testBasicBonusSalary() throws Exception {
		String sDate1="31/12/2016";  
	    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);	    
		employee2 = new SalaryEmployee("Bob","1234S","bob@bob.bob",date1,40000.0);
		assertEquals(1924.0,bonusCalculator.calcuateBonus(employee2));
	}

}
