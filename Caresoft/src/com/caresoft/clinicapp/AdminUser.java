package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin, HIPAACompliantUser {
	// ... imports class definition...

	// Inside class:
	private Integer employeeID;
	private String role;
	private ArrayList<String> securityIncidents = new ArrayList<>();

	public AdminUser(Integer employeeID, String role) {
		// TODO Auto-generated constructor stub
		super(employeeID);
		this.employeeID = employeeID;
		this.role = role;
	}

	// TO DO: Setters & Getters
	public Integer getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	// METHODS
	public void newIncident(String notes) {
		String report = String.format("Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", new Date(),
				this.id, notes);
		securityIncidents.add(report);
	}

	public void authIncident() {
		String report = String.format("Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", new Date(), this.id,
				"AUTHORIZATION ATTEMPT FAILED FOR THIS USER");
		securityIncidents.add(report);
	}

	@Override
	public boolean assignPin(int pin) {
		int pinLength = String.valueOf(pin).length();

		if (pinLength == 6) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (this.id.equals(confirmedAuthID)) {
			newIncident("Passwed");
			return true;
		} else {
			authIncident();
			return false;
		}
	}

	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub

		return securityIncidents;
	}

	@Override
	public boolean assignPIN(int pin) {
		// TODO Auto-generated method stub
		return false;
	}
}
