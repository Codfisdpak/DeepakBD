package org.data;

//static modifier // in same class
public final class Employee {
	static int  a =10;

	public static void empName() {
		System.out.println("Employee name is codfis");
	}

	public static void empAddress() {
		System.out.println("Employee address is 1234 street");
	}

	public static void main(String[] args) {

		empName();
		empAddress();
		System.out.println(a);

	}

}
