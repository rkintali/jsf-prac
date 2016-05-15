package com.prac;

import java.io.Serializable;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import com.prac.dao.ElementSources;
import com.prac.daoImpl.ElementSourceImpl;

@ManagedBean(name = "helloBean", eager = true)
@SessionScoped
public class HelloWorld implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// private String message;

	@ManagedProperty(value = "#{formBean}")
	FormBean formBean;

	ElementSources elementSources;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	public void init() {
		System.out.println("Post construct method - executed");
		this.getFormBean().setUserName("This is a message from post construct");
	}

	public String getGreetMsg() {
		if (this.getFormBean().getUserName() != null) {
			return "Good day: " + this.getFormBean().getUserName() + "!";
		} else {
			return null;
		}
	}

	public FormBean getFormBean() {
		return formBean;
	}

	public void setFormBean(FormBean formBean) {
		this.formBean = formBean;
	}

	/*
	 * action handler to show lucky message
	 */
	public String showLuckyMessage() {
		// set request param
		Map<String, String> reqParams = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
		formBean.setReqParam(reqParams.get("reqParam"));

		if ("Ram".equalsIgnoreCase(this.getFormBean().getUserName())) {
			return "goodboy";
		} else {
			return "badboy";
		}
	}

	public void actionListener(ActionEvent event) {
		// set request attr
		formBean.setReqAttr((String) event.getComponent().getAttributes().get("reqAttr"));

	}

	public ElementSources getElementSources() {
		if (this.elementSources == null) {
			this.elementSources = new ElementSourceImpl();
		}
		return elementSources;
	}

	public void setElementSources(ElementSources elementSources) {
		this.elementSources = elementSources;
	}

}