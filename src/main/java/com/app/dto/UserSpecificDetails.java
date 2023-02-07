package com.app.dto;

public class UserSpecificDetails {
private Integer id;
private String username;
public UserSpecificDetails() {
	super();
}
public UserSpecificDetails(Integer id, String username) {
	super();
	this.id = id;
	this.username = username;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "UserSpecificDetails [id=" + id + ", username=" + username + "]";
}

}
