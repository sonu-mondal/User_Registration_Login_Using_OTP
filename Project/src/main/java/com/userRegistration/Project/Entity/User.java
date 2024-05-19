package com.userRegistration.Project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="email_id")
	private String emailId;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="user_name")
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

	public User(int id, String emailId, String mobileNumber, String userName, String oTP) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.mobileNumber = mobileNumber;
		this.userName = userName;
		OTP = oTP;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", emailId=" + emailId + ", mobileNumber=" + mobileNumber + ", userName=" + userName
				+ ", OTP=" + OTP + "]";
	}

	public boolean isVerified() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
	
	
}
