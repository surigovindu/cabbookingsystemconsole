package com.project0.db;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

public class dbConnect {
	public static Connection getConnection() throws Exception{
		
		FileInputStream fileStream = new FileInputStream("D:\\Revature\\Week 1 Assignments\\CabBooking\\src\\main\\resources\\jdbc.properties"); 
		Properties properties = new Properties(); //taking connection credentials from jdbc.properties file.
		properties.load(fileStream);
		String url = properties.getProperty("url");	//making use of our connection credentials from the file.
		String id = properties.getProperty("id"); 
		String pwd = properties.getProperty("pwd");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, id, pwd);//creating connection
		
		return con;
	}

}