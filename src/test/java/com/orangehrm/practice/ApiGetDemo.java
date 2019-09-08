package com.orangehrm.practice;

import org.junit.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ApiGetDemo {

	@Test
	public void getWeather() {

		// get method will give you back response
		Response response = RestAssured.when().get("http://restapi.demoqa.com/utilities/weather/city/Fairfax");

		// response.prettyPrint();
		int code = response.getStatusCode();
		// System.out.println(code);
		Assert.assertEquals(200, code);
		
	}

	@Test
	public void getCountry() {
		Response response1 = RestAssured.when().get("http://restcountries.eu/rest/v1/name/France");

		//response1.prettyPrint();
		int code1 = response1.getStatusCode();
		//System.out.println(code1);
		Assert.assertEquals(200, code1);
		
		// retrieve body response as String 
		String body = response1.asString();
		System.out.println(body);
		Assert.assertTrue(body.contains("Paris"));
		
		// retrieve body header date as String 
		String header = response1.getHeader("Date");
		System.out.println(header);
		
	}
}
