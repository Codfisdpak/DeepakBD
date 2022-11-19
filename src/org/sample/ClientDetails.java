package org.sample;

public class ClientDetails {

	public static void main(String[] args) {

		// datatype object[]= new dataype[size];

		int a[] = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 10;
		
		System.out.println(a[6]);
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("iterate array using normal forloop :"+a[i]);
			
		}
		
		
		for (int b : a) {
			
			System.out.println("enhanced forloop or foreach : "+b);
			
		}

	}

}

/*
 * array is used to store mulitple value of similar datatype in a single var
 * array is an index based 
 * that index starts from 0
 * size of an array fixed at compile time
 * array allows duplicates
 * 
 * 
 * 
 * 
 * 
 * 
 */
