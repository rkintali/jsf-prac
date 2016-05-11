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
	/*@ManagedProperty(value = "#{message}")
	private Message messageBean;
*/
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
		/*if (messageBean != null) {
			message = messageBean.getMessage();
		} else {
			message = "This is a simple message";
		}*/
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	/*public void setMessageBean(Message message) {
		this.messageBean = message;
	}*/
}