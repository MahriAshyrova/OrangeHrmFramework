package com.orangehrm.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;

//Task 1: display department_id and department_name in one row
public class Task1 {

	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";
	String dbUsername = "Syntax";
	String dbPassword = "syntax123";

	@Test
	public void displayDB() throws SQLException {

		Connection connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select department_id, department_name from departments");
		
		while (resultSet.next()) {
			int dep_id = resultSet.getInt("DEPARTMENT_ID");
			String dep_name = resultSet.getString("DEPARTMENT_NAME");
			System.out.println(dep_id + " " + dep_name);
		}
		connection.close();
		statement.close();
		resultSet.close();
	
	}

}
