package com.orangehrm.practice;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class HamcrestTest {

	/**
	 * Retrieve quote of specific character (varys) and verify that response code is 200 
	 * and response contains "Power resides where men believe it resides"
	 */
	
	@Test 
	
	public void verifyResponse() {
		
		RestAssured.baseURI="https://got-quotes.herokuapp.com";
		
		// 1 way using Junit assertions 
		Response response = 
		given().queryParam("char", "varys").
		when().get("/quotes");
		
		String responseBody = response.asString();
		System.out.println(responseBody );
		Assert.assertTrue(responseBody.contains("Varys"));
		
		int code = response.getStatusCode();
		Assert.assertEquals(code, 200);
			
		
		// 2 way to complete request and assertions 
		given().queryParam("char", "varys").
		when().get("/quotes").
		then().assertThat().statusCode(200).
		and().
		assertThat().body("character", equalTo("Varys"));
		
		// 3 way 
		Response resp=
		given().queryParam("char", "varys").
		when().get("/quotes");
		
		resp.then().assertThat().statusCode(200).and().body("character", equalTo("Varys"));
				
	}

}
	
	
	

