package com.servlet.service;

import java.util.ArrayList;

import com.servlet.model.Registration;

public abstract class SeaWorldService {

	public abstract boolean addRegistrationData(Registration reg);

	public abstract boolean validateLogin(String username, String password);

	public abstract Registration getUserDetails(String userName);

}
