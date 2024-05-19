package com.userRegistration.Project.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class UserDTO {

	private int id;
	@Email(message="Email format is incorrect")
	@NotNull(message="Email can not be empty")
	private String emailId;
	@Pattern(regexp = "^[6-9]\\d{9}$", message="Mobile Number is invalid")
	@NotNull(message="Mobile number can not be empty")
	private String mobileNumber;
	@NotNull(message="User name can not be empty")
	private String userName;
	
	private String OTP;

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

	public String getOTP() {
		return OTP;
	}

	public void setOTP(String oTP) {
		OTP = oTP;
	}

	public UserDTO(int id,
			@Email(message = "Email format is incorrect") @NotNull(message = "Email can not be empty") String emailId,
			@Pattern(regexp = "^[6-9]\\d{9}$", message = "Mobile Number is invalid") @NotNull(message = "Mobile number can not be empty") String mobileNumber,
			@NotNull(message = "User name can not be empty") String userName, String oTP) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.userName = userName;
		OTP = oTP;
	}

	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", userName="
				+ userName + ", OTP=" + OTP + "]";
	}
	
	
	
	
}
