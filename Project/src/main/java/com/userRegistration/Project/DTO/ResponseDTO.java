package com.userRegistration.Project.DTO;

public class ResponseDTO {

	
    private int id;
	 private String emailId;
	 private String mobileNumber;
	 private String userName;
	 private boolean verified;
	 private String message;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ResponseDTO(int id, String emailId, String mobileNumber, String userName, boolean verified, String message) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.userName = userName;
		this.verified = verified;
		this.message = message;
	}
	public ResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ResponseDTO [id=" + id + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", userName="
				+ userName + ", verified=" + verified + ", message=" + message + "]";
	}
	 
	 
}
