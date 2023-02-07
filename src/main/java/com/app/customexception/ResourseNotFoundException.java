package com.app.customexception;

public class ResourseNotFoundException extends RuntimeException {

public ResourseNotFoundException(String mesg) {
	super(mesg);
}

}
