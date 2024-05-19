package com.userRegistration.Project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userRegistration.Project.Entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public User findByEmailIdAndOTP(String emailId, String OTP);

	public User findByEmailId(String emailId);

}
