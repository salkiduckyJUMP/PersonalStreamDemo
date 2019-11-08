package com.collabera.streamdemo;

public class Professor {
	
	//Fields
	private String fName;
	private String lName;
	private String subject;
	private String house;
	
	//Constructor
	public Professor(String fName, String lName, String subject, String house) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.subject = subject;
		this.house = house;
	}
	
	@Override
	public String toString() {
		return "Professor [fName=" + fName + ", lName=" + lName + ", subject=" + subject + ", house=" + house + "]";
	}
	
	//Getters + Setters
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
		
	
}
