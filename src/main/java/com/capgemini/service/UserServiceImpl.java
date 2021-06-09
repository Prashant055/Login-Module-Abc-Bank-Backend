package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Registration;
import com.capgemini.entities.User;
import com.capgemini.exception.UserException;
import com.capgemini.repository.IRegistrationRepository;
import com.capgemini.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepository iUserRepository;

	@Autowired
	private IRegistrationRepository iRegistrationRepository;

	@Override
	public String UserLogin(User user) throws UserException {

		if (!iRegistrationRepository.existsById(user.getUserId())) {
			throw new UserException("UserId Invalid");
		}
		
		Registration dbUser = iRegistrationRepository.findById(user.getUserId()).get();

		if (!dbUser.getPassword().equals(user.getPassword())) {
			throw new UserException("Incorrect Password");
		}

		iUserRepository.save(user);

		return "Login Successful";
	}

	@Override
	public String UserLogout(User user) throws UserException {

		if (!iUserRepository.existsById(user.getUserId())) {
			throw new UserException("UserId Invalid");
		}
		
		User dbUser = iUserRepository.findById(user.getUserId()).get();

	

		if (!dbUser.getPassword().equals(user.getPassword())) {
			throw new UserException("Incorrect Password");
		}

		iUserRepository.delete(dbUser);

		return "Logout Successful";
	}

	@Override
	public String AdminLogin(User user) throws UserException {
		if (!iRegistrationRepository.existsById(user.getUserId())) {
			throw new UserException("UserId Invalid");
		}
		
		Registration dbUser = iRegistrationRepository.findById(user.getUserId()).get();


		if (!dbUser.getPassword().equals(user.getPassword())) {
			throw new UserException("Incorrect Password");
		}

		iUserRepository.save(user);

		return "Admin Login Successful";
	}

	@Override
	public String AdminLogout(User user) throws UserException {
	
		if (!iUserRepository.existsById(user.getUserId())) {
			throw new UserException("UserId Invalid");
		}
		
		User dbUser = iUserRepository.findById(user.getUserId()).get();


		if (!dbUser.getPassword().equals(user.getPassword())) {
			throw new UserException("Incorrect Password");
		}

		iUserRepository.delete(dbUser);

		return "Admin Logout Successful";
	}

}