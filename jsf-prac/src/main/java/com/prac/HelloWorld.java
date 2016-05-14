package com.prac;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloBean", eager = true)
@SessionScoped
public class HelloWorld implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	public void init() {
		System.out.println("Post construct method - executed");
		this.setMessage("This is a message from post construct");
	}

	public String getMessage() {
		// message = "test";
		// System.out.println("Getting message");
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getGreetMsg() {
		if (this.getMessage() != null) {
			return "Good day: " + this.getMessage() + "!";
		} else {
			return null;
		}
	}

}