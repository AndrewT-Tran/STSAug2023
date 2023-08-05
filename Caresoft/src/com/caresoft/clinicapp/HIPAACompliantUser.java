package com.caresoft.clinicapp;

public interface HIPAACompliantUser {
	abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
	boolean assignPIN(int pin);
}
