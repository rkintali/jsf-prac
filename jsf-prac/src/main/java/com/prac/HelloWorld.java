package com.prac;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloBean", eager = true)
@SessionScoped
public class HelloWorld implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	@PostConstruct
	public void init() {
		System.out.println("Post construct method - executed");
		this.setMessage("This is a message from post construct");
	}

	public String getMessage() {
		System.out.println("Getting message");
		message = "This is a smiple message";
		
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}