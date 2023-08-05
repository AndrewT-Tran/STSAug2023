package com.andrew.abstractclassdemo;

public class Test {

	public static void main(String[] args) {
		Cash laptop = new Cash(1500);
		laptop.paymentDetails();
		
		CreditCard tacos = new CreditCard(2.99,"000000000","Andrew","12/24");
		tacos.paymentDetails();
	}

}
 