package com.mycompany.app;

public class Greeting {
	
	public Greeting(String message) {
		this.message = message;
	}

	public static String message;

	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		Greeting.message = message;
	}
	
	

}
