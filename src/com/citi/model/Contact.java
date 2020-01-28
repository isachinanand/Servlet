package com.citi.model;

public class Contact {
private int contactId;
private String firstName;
private String lastName;
private String emailId;
private String phoneNo;

public int getContactId() {
	return contactId;
}
public void setContactId(int contactId) {
	this.contactId = contactId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getPhoneNo() {
	return phoneNo;
}
public void setPhoneNo(String phoneNo) {
	this.phoneNo = phoneNo;
}
public Contact(int contactId, String firstName, String lastName, String emailId, String phoneNo) {
	super();
	this.contactId = contactId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.emailId = emailId;
	this.phoneNo = phoneNo;
}
public Contact() {
	super();
}



}
