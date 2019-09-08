package com.orangehrm.practice;

import java.util.LinkedHashMap;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {
	
	@Test
	public void createStudent() {
	Map<String, Object> map = new LinkedHashMap();
	
	map.put("id", 0);
	map.put("firstName", "Karina");
	map.put("lastName", "Mike");
	map.put("age", 40);
	map.put("batch", 5);
	map.put("batchStartDate", "2019-09-09");
	map.put("batchEndDate", "2020-09-08");
	map.put("course", "Selenium");
	map.put("attendanceNature", "New Jersey");
	map.put("streetAddress", "123 Clifton");
	map.put("city", "Clifton");
	map.put("state", "NJ");
	map.put("zipCode", "21234");
	

	RestAssured.baseURI="https://pure-ravine-92491.herokuapp.com/syntax";
	
	Response response =
	given().accept(ContentType.JSON).header("Content-Type", "application/json").body(map).
	when().post("/api/createStudentProfile");
	
	response.then().assertThat().statusCode(201);
	
	response.prettyPrint();
	
	int studentId=response.jsonPath().get("id");
	System.out.println(studentId);

	Map<String, Object> responseMap =response.as(Map.class);
	System.out.println(responseMap);
	
	for(Map.Entry<String, Object> mp: responseMap.entrySet()) {
		System.out.println(mp.getKey()+": "+mp.getValue());
		
	}
	
	
	
		
	}	
}
