package com.orangehrm.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JdbcDemo {
	
String dbUrl ="jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";
String dbUsername="Syntax";
String dbPassword="syntax123";


@Test
public void dbConnection() throws SQLException {
	// creating A  CONNECTION 
	Connection connection =DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	
	// create a statement 
	Statement statement= connection.createStatement();
	// exceute query and stores from database  in ResultSet Object 
	ResultSet resultSet =statement.executeQuery("select * from countries");
	// get values from resultSet
	
	resultSet.next(); 
	String columnData= resultSet.getString("Country_Name"); 
	System.out.println(columnData);
	
	System.out.println("-----Printing values using loop-----");
	while(resultSet.next()) {
	columnData=resultSet.getString("Country_Name");
	System.out.println(columnData);
	}
	
	//close all db connection 
	connection.close();
	statement.close();
	resultSet.close();
	
}
}
