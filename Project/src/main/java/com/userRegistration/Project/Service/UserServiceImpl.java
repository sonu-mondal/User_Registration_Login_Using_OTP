package com.userRegistration.Project.Service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.userRegistration.Project.DTO.RequestDTO;
import com.userRegistration.Project.DTO.ResponseDTO;
import com.userRegistration.Project.DTO.UserDTO;
import com.userRegistration.Project.Entity.User;
import com.userRegistration.Project.Exception.ResourceFoundException;
import com.userRegistration.Project.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	EmailOTPService emailOTPService;

	@Override
	public String addUser(UserDTO userDTO) throws MethodArgumentNotValidException {
		User getUser=userRepository.findByEmailId(userDTO.getEmailId());
		if(getUser!=null) {
			throw new ResourceFoundException(userDTO.getEmailId());//
		}
		User user=new User();
		user.setId(userDTO.getId());
		user.setEmailId(userDTO.getEmailId());
		user.setMobileNumber(userDTO.getMobileNumber());
		user.setUserName(userDTO.getUserName());
			
		User saveUser=userRepository.save(user);
		return saveUser.getUserName();
	}
	
	
	
	public String LoginUser(RequestDTO requestDTO){
		ResponseDTO res = new ResponseDTO();
		
		User existingUser = this.userRepository.findByEmailId(requestDTO.getEmailId());
		if(existingUser != null)
		{
			Random random = new Random();
			String OTP = String.format("%06d", random.nextInt(100000));
			
			User newUser = new User();
			newUser.setEmailId(requestDTO.getEmailId());
			newUser.setMobileNumber(requestDTO.getMobileNumber());
			newUser.setUserName(requestDTO.getUserName());
			newUser.setOTP(OTP);
			
			//newUser.setVerified(false);
			
		 User savedUser = this.userRepository.save(newUser);
		 String subject = "Email Verfication";
		 String body = "Your 6 digit OTP for verification is "+savedUser.getOTP();
		 //Email Send
		 this.emailOTPService.sendOTPToEmail(savedUser.getEmailId(), subject, body);
		 
		 res.setEmailId(savedUser.getEmailId());
		 res.setUserName(savedUser.getUserName());
		 res.setMobileNumber(savedUser.getMobileNumber());
		 res.setMessage("OTP sent to registered email id successfully!");
 
		}
		else {
			res.setMessage("Not a registered User!!!");
		}
		
		return res.getMessage();
		
	}
	
	public String verifyUserWithOTP(String emailId, String OTP) {
		String response = "";
		User user = this.userRepository.findByEmailIdAndOTP(emailId, OTP);
		
		if(user != null && OTP.equals(user.getOTP()) && emailId.equals(user.getEmailId())) {// && user.getEmailId().equals(emailId) && OTP.equals(user.getOTP())) {
			response = "User verified successfully.";
		}
		else {
			response = "User not verified.";
		}
		return response;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	@Override
//	public LoginResponse LogInUser(LoginDTO loginDTO) {
////		String msg="";
//		User user=userRepository.findByEmail(loginDTO.getEmailId());
//		if(user!=null) {
//			//String OTP=loginDTO.getOTP();
//			Optional<User> user1=userRepository.findByEmailAndOTP(loginDTO.getEmailId(), loginDTO.getOTP());
//			if(user1!=null) {
//				return new LoginResponse("You Logged in successfully!!", true);
//			}
//			else {
//				return new LoginResponse("Your Login Failed!!", false);
//			}
//			
//		}
//		return new LoginResponse("Email or OTP not matching", false);
//		
//	}
//	
	

}
