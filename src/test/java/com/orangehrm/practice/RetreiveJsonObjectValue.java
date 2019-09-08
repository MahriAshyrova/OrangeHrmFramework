package com.orangehrm.practice;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import java.util.List;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class RetreiveJsonObjectValue {

	/*
	 * Retreive all students and verify that GET response code is 200 and retrieve
	 * first name of a second student Retrieve all students lastName;
	 */

	@Test
	public void getAllStudents() {

		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";
		Response response = given().when().get("/api/getAllStudentProfiles");

		// validate the Status code 
		response.then().assertThat().statusCode(200);
		
		response.prettyPrint();
		
		
		JsonPath jPath = response.jsonPath();
		String firstName=jPath.get("firstName[1]");
		System.out.println("-------First name of a second student----------");
		System.out.println(firstName);
		
		List<String> lastNames=jPath.get("lastName");
		System.out.println("-------Last Names----------");
		for (String lastName: lastNames) {
			System.out.println(lastName);
		}
	}

	

}
