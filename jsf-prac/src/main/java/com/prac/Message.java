package com.prac;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "message", eager = true)
@SessionScoped
public class Message implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message = "Hello World!";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}