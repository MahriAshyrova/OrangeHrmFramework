package com.orangehrm.practice;
import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class Parameters {
	
	@Test
	public void queryParameters() {
		
		RestAssured.baseURI="http://reqres.in";
		Response resp = 
				
					  given().queryParam("page", "2").
				      
				      when().get("/api/users");
		
	Assert.assertEquals(200, resp.getStatusCode());		
	Assert.assertTrue(resp.asString().contains("Tracey"));
		
	}
	
	@Test
	public void pathParameters() {
		
		RestAssured.baseURI="http://reqres.in";
		
							given().pathParam("id", "2").
							when().get("/api/users/{id}").
							then().statusCode(200);
							
	}

}
