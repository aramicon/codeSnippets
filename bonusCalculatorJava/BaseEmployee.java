package com.donakello.learn;

import java.util.Date;

public class BaseEmployee {
	private String name;
	private String employeeID;
	private String emailAddress;
	private Date dateStarted;

	public BaseEmployee(String name, String id, String email, Date dateStarted) {
		this.name = name;
		this.employeeID = id;
		this.emailAddress = email;
		this.dateStarted = dateStarted;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Date getDateStarted() {
		return dateStarted;
	}

	public void setDateStarted(Date dateStarted) {
		this.dateStarted = dateStarted;
	}

}
