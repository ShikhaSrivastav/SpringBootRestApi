package com.app.dto;

import java.time.LocalDateTime;

public class ApiResponse {
 private LocalDateTime timestamp;
 private String msg;
public ApiResponse( String msg) {
	super();
	this.timestamp = LocalDateTime.now();
	this.msg = msg;
}
public ApiResponse() {
	super();
}
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}

 
}
