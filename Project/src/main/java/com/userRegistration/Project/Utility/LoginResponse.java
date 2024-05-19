package com.userRegistration.Project.Utility;

public class LoginResponse {
	
	private String message;
	private Boolean status;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public LoginResponse(String message, Boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	public LoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Login [message=" + message + ", status=" + status + "]";
	}
	

}
