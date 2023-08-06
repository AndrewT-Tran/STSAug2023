package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private Integer employeeID;
	private String role;
	private ArrayList<String> securityIncidents;

	public AdminUser(Integer employeeID, String role) {
		super(employeeID);
		this.employeeID = employeeID;
		this.role = role;
		this.securityIncidents = new ArrayList<String>();
		// we add this because we get null pointer which means the securityIncidents array list 
		// has not implemented yet
		// this will create a new ArrayList object and assign it to the securityIncidents field, 
		// which can be used to store security incidents.
	}
	// TO DO: Implement a constructor that takes an ID and a role
	// TO DO: Implement HIPAACompliantUser!
	// TO DO: Implement HIPAACompliantAdmin!

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
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return securityIncidents;
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
		if (this.id.equals(confirmedAuthID)) {
			newIncident("Passwed");
			return true;
		} else {
			authIncident();
			return false;
		}
	}

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

	// TO DO: Setters & Getters
}
