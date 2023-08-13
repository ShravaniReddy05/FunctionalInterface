package com.functionalinterface;

public class Person {
	String personName;
	String emailId;
	 //getter setter methods and constructor  
	
	
	
	public String getPersonName() {
		return personName;
	}
	public Person(String personName, String emailId) {
		super();
		this.personName = personName;
		this.emailId = emailId;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	 }
