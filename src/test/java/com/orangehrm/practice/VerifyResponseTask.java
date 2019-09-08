package com.orangehrm.practice;

import static io.restassured.RestAssured.given;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class VerifyResponseTask {

	// retrieve student with id 123 and verify that response status code is 200
	// and first name of a student is Vladimir

	@Test

	public void verifyResponse() {

		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";

		given().pathParam("studentId", "123").
		when().get("/api/getStudentProfile/{studentId}").
		then().statusCode(200).and().assertThat().body("firstName", equalTo("Vladimir"));
		
		

	}

}
