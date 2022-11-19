package org.sample;

//fully abstraction
//child class
public class Face implements FaceBook {

	@Override
	public void username() {

		System.out.println("username is qwerty@123");

	}

	@Override
	public void password() {

		System.out.println("password is 4545");

	}

	@Override
	public void login() {

		System.out.println("login within 10 min");

	}

	public static void main(String[] args) {

		Face f = new Face();
		f.username();
		f.password();
		f.login();
	}

}
