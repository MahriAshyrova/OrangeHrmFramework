package com.orangehrm.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class Task2 {

	// process query that will give the results of street address, city, and country name and store results inside the list 
	
	
	String dbUrl = "jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";
	String dbUsername = "Syntax";
	String dbPassword = "syntax123";
	
	@Test
	public void getData() throws SQLException {

	Connection con =DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
	Statement st =con.createStatement();
	ResultSet rs=st.executeQuery("select street_address, city, country_name from locations l join countries c on l.country_id=c.country_id");
		
	List<Map<String, String>> rsList = new ArrayList();	
	
	while (rs.next()) {
		Map<String, String> map = new HashMap();
		map.put("street_address", rs.getString("street_address"));
		map.put("city", rs.getString("city"));
		map.put("country_name", rs.getString("country_name"));
		rsList.add(map);	
	}
		
	Iterator<Map<String, String>>it=rsList.iterator(); 
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println(rsList);	
			
	}
}
