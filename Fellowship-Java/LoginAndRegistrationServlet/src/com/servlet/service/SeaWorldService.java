package com.servlet.service;

import java.util.ArrayList;

import com.servlet.model.Registration;

public abstract class SeaWorldService {
	
	
	public abstract boolean addRegistrationData(Registration reg);
	public abstract ArrayList<Registration> viewRegistrateredUsers();
	public abstract boolean updateRegisteredUsers();
	public abstract boolean deleteRegisteredUsers();
	public abstract boolean validateLogin(String username,String password);

}
