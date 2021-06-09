package com.capgemini.service;

import com.capgemini.entities.Registration;
import com.capgemini.exception.RegistrationException;

public interface IRegistrationService {

	public String EmployeeRegistration(Registration registration) throws RegistrationException;
	public String UserRegistration(Registration registration) throws RegistrationException;
}