package org.entity;

public class User {
private int user_id;
private String username;
private String firstName;
private String lastName;
private String email;



public User(int user_id, String username, String firstName, String lastName, String email) {
	super();
	this.user_id = user_id;
	this.username = username;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
}
