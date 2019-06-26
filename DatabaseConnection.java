package com.tendecoders;
import java.sql.*;
public class DatabaseConnection {
	DatabaseConnection(){
		
		connect();
	}
	
	public Connection con;
	
public void connect() {
	
	
		try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		con=DriverManager.getConnection("jdbc:mysql://localhost:3307/madhu","root","root");
			}catch (Exception e) {
		System.out.println(e);
		}
}
}
