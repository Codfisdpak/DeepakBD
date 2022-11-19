package org.data;
//parent class
//partial abstraction
public abstract class Company {

	// Abstract method

	public abstract void comName();

	// Non abstract method

	public void comAddress() {
		System.out.println("company address is 1234 street");
	}

}
