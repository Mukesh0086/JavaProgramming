package com.servlet.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Utility {

	private static final String DRIVER="com.mysql.jdbc.Driver";
	//private static final String URL=";
	private static final String USERNAME="punk";
	private static final String PASSWORD="punk";
	 
	    
	    public static Connection getConnection() throws SQLException{
	    	Connection con = null;
	    	
	    	try {
				 Class.forName(DRIVER);
				 con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/SeaWorld",USERNAME,PASSWORD);
				 System.out.println("Connection Established");
			    	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
            
   
	    	System.out.println("inside connection method");
	    	return con;
	    	
	    }
	
	
	
	
}
