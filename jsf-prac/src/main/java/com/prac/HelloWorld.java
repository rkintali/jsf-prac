package com.prac;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloBean", eager = true)
@SessionScoped
public class HelloWorld implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private String message;

	@ManagedProperty(value="#{message}")
	Message messageBean;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	public void init() {
		System.out.println("Post construct method - executed");
		this.getMessageBean().setMessage("This is a message from post construct");
	}

	public String getGreetMsg() {
		if (this.getMessageBean().getMessage() != null) {
			return "Good day: " + this.getMessageBean().getMessage() + "!";
		} else {
			return null;
		}
	}

	public Message getMessageBean() {
		return messageBean;
	}

	public void setMessageBean(Message messageBean) {
		this.messageBean = messageBean;
	}

}