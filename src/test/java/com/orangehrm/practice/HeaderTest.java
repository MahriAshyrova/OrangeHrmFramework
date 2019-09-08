package com.orangehrm.practice;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HeaderTest {

	/*
	 * when i send get request to the API "/api/getAllStudentProfiles" then response
	 * code is 200 and response header "Content-type" contains 'application/json"
	 */

	@Test
	public void getAllStudents() {

		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";
		Response response = given().when().get("/api/getAllStudentProfiles");

		response.then().assertThat().statusCode(200).and().header("Content-Type",
				equalTo("application/json;charset=UTF-8"));

	}
}
