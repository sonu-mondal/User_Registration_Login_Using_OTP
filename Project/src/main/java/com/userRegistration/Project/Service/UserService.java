package com.userRegistration.Project.Service;

import org.springframework.web.bind.MethodArgumentNotValidException;

import com.userRegistration.Project.DTO.UserDTO;

public interface UserService {
	
	public String addUser(UserDTO userDTO) throws MethodArgumentNotValidException;
	

}
