package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBC {
public static void main(String[] args) {
	Connection con = null;
	String URLs="jdbc:mysql://localhost:3306?user=root&password=admin@123";
	try {
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    con  = DriverManager.getConnection(URLs);
			System.out.println("Connection established");
			PreparedStatement ps=con.prepareStatement("select * from SeaWorld.SeaWorld_Register");
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getString(1));
			}
	    	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
    

	System.out.println("inside connection method");
}
}
