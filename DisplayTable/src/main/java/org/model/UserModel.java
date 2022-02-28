package org.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.entity.User;

public class UserModel {
public List<User> listUsers()
{

	Statement st= null; 
	ResultSet rs=null; 
	Connection con=null;
	List<User> users= new ArrayList<User>();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users?"+"user=root&password=");
		String query="select * from user"; 
		st=con.createStatement();
		rs=st.executeQuery(query);
		while(rs.next()) {
			users.add(new User(rs.getInt("user_id"), rs.getString("username"),rs.getString("firstName"),rs.getString("lastName"),rs.getString("email")));
		}
		con.close();
		
	} catch (SQLException | ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return users;
}
}
