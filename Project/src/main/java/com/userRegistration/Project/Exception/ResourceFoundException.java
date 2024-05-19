package com.userRegistration.Project.Exception;

public class ResourceFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String emailId;

	public ResourceFoundException(String emailId) {
		super(String.format("%s is already registerd!!", emailId));
		this.emailId = emailId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
