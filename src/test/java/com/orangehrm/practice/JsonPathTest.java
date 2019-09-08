package com.orangehrm.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class JsonPathTest {

	// retrieve value of a specific key
	
	@Test
	public void test1() {

		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";

		Response response =
		given().pathParam("studentId", "123").
		when().get("/api/getStudentProfile/{studentId}");

		response.prettyPrint();
		response.then().statusCode(200).and().assertThat().body("firstName", equalTo("Vladimir"));

		JsonPath jPath = response.jsonPath();

		String lastName = jPath.get("lastName");
		System.out.println(lastName);

	}
	
	//@Test
	public void getAllStudents() {
		
		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";

		Response response =
		given().when().get("/api/getAllStudentProfiles");	
		
		// response.prettyPrint();
		JsonPath jPath = response.jsonPath();
		
		// get value of last name of the 3rd object 
		String lastName = jPath.get("lastName[2]");
		System.out.println(lastName);
		
		List<String> fName= jPath.get("firstName");
		for (String name : fName) {
			System.out.println(name);
		}	
	}	
}
