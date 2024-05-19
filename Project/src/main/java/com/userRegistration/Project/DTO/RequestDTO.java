package com.userRegistration.Project.DTO;

public class RequestDTO {
	
	private String emailId;
	private String mobileNumber;
	private String userName;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public RequestDTO(String emailId, String mobileNumber, String userName) {
		super();
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.userName = userName;
	}
	public RequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RequestDTO [emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", userName=" + userName + "]";
	}
	
	
	
}
