package com.prac;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorld", eager = true)
@SessionScoped
public class HelloWorld {
	@ManagedProperty(value = "#{message}")
	private Message messageBean;

	private String message;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	@PostConstruct
	public void init(){
		System.out.println("Post construct method - executed");
		this.message = "This is a message from post construct";
	}
	public String getMessage() {
		System.out.println("Getting message");
		if (messageBean != null) {
			message = messageBean.getMessage();
		}else{
			message = "This is a simple message";
		}
		return message;
	}

	public void setMessageBean(Message message) {
		this.messageBean = message;
	}
}