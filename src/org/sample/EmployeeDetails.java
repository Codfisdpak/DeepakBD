package org.sample;

public class EmployeeDetails {

	public static void main(String[] args) {

		// logical OR
		int clgId = 123, deptId = 987;

		// 123==12 f 987==987 t
		if (clgId == 123 |deptId == 98) {

			System.out.println("Anna university civil dept");

		} else {

			System.out.println("some other clg or dept");

		}

	}
}
