package com.capgemini.service;

import com.capgemini.entities.User;
import com.capgemini.exception.UserException;

public interface IUserService {

	public String UserLogin(User user) throws UserException;
	
	public String AdminLogin(User user) throws UserException;

	public String UserLogout(User user) throws UserException;
	
	public String AdminLogout(User user) throws UserException;
	
	

}