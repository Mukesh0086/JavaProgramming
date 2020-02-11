package com.servlet.dao;

import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.servlet.model.Registration;
import com.servlet.service.SeaWorldService;
import com.servlet.utility.Utility;

public class SeaWorldDao extends SeaWorldService{

	@Override
	public boolean addRegistrationData(Registration reg) {
		PreparedStatement ps=null;
		
		try {
			Connection con=Utility.getConnection();
			ps=con.prepareStatement("insert into Register_SeaWorld(FirstName,LastName,UserName,Email,PhoneNumber,Password) values(?,?,?,?,?,?)");
			ps.setString(1, reg.getFirstName());
			ps.setString(2, reg.getLastName());
			ps.setString(3, reg.getUserName());
			ps.setString(4, reg.getEmail());
			ps.setLong(5, reg.getPhoneNumber());
			ps.setString(6, reg.getPassword());
			ps.execute();
		
			return true;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
	@Override
	public boolean validateLogin(String username, String password) {
		boolean flag=false;
		try {
			Connection con=Utility.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from Register_SeaWorld");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				String dbUserName=rs.getString("UserName");
				System.out.println(dbUserName);
				String dbPassword=rs.getString("Password");
				System.out.println(dbPassword);
				if(dbUserName.equalsIgnoreCase(username) && dbPassword.equals(password))
				{
					flag=true;
				}
			}
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public Registration getUserDetails(String userName) {
		
		Registration reg=new Registration();;
		try {
			
			Connection con=Utility.getConnection();
			System.out.println(con);
			Statement ps=con.createStatement();
			ResultSet rs=ps.executeQuery("select * from Register_SeaWorld where UserName='"+userName+"'");
			
			while(rs.next())
			{		
			reg.setId(rs.getLong(1));	
			reg.setFirstName(rs.getString(2));
			reg.setLastName(rs.getString(3));
			reg.setUserName(rs.getString(4));
			reg.setEmail(rs.getString(5));
			reg.setPassword(rs.getString(7));
			reg.setPhoneNumber(rs.getLong(6));
			}
			
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reg;
	}
	
	

}
