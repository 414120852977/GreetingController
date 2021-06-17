package com.example.demo;

public class Greeting {
	private final String message;
	private final long id;

	public Greeting(long id, String message ) {
		this.id= id;
		this.message = message;
	}
	
	public long getId() {
		return id;
	}
	
	public String getMessage() {
		return message;
	}
}
