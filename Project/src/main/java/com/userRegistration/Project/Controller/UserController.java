package com.userRegistration.Project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.userRegistration.Project.DTO.RequestDTO;
import com.userRegistration.Project.DTO.UserDTO;
import com.userRegistration.Project.Service.UserServiceImpl;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value="/user")
@CrossOrigin
//@Validated
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	//http://localhost:9910/user/register
	@PostMapping(value="/register")
	public ResponseEntity<String> saveUser(@Valid @RequestBody UserDTO userDTO) throws MethodArgumentNotValidException{
		String userName=userServiceImpl.addUser(userDTO);
		return new ResponseEntity<>(userName, HttpStatus.CREATED);
	}
	
	//http://localhost:9910/user/login
	@PutMapping("/login")
	public ResponseEntity<String> registerUser(@RequestBody RequestDTO	 requestDTO) {
		String res = this.userServiceImpl.LoginUser(requestDTO);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	
	//http://localhost:9910/user/verifyWithOTP?email=sonu112mondal98@gmail.com&OTP=079405
	@PostMapping("/verifyWithOTP")
	public ResponseEntity<?> verifyUser(@RequestParam String email, @RequestParam String OTP) {
		String res = this.userServiceImpl.verifyUserWithOTP(email, OTP);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

}
