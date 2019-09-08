package com.orangehrm.practice;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaDataDemo {

	
	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";
	String dbUsername = "Syntax";
	String dbPassword = "syntax123";

	@Test
	public void getMetaData() throws SQLException {
		
		// connection to the database in the cloud 
		Connection con=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		DatabaseMetaData dbMetaData=con.getMetaData();
		
		// print database name
		String dbName=dbMetaData.getDatabaseProductName();
		System.out.println(dbName);
		
		// print database version 
		String dbVersion= dbMetaData.getDatabaseProductVersion();
		System.out.println(dbVersion);
		// ---------------------------------------------
		
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("select * from employees where job_id='IT_PROG'"); 
		ResultSetMetaData rsMetaData=rs.getMetaData();
		
		// get total number of columns 
		int colNum= rsMetaData.getColumnCount();
		System.out.println(colNum);
		
		// get name of the column 
		String colName=rsMetaData.getColumnName(1);
		System.out.println(colName);
		
		// print all column names 
		for (int i=1; i<=colNum; i++) {
			String colAllNames=rsMetaData.getColumnName(i);
			System.out.println(colAllNames);
		}
		con.close();
		statement.close();
		rs.close();
		
	}
	
	
	
}
