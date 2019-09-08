package com.orangehrm.practice;
import org.junit.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class SearchStudentIDByPassingParameter {

	
	@Test
	public void getStudentId() {
		
		
		RestAssured.baseURI="https://pure-ravine-92491.herokuapp.com/syntax";
		
		given().pathParam("studentId", "85").
		when().get("/api/getStudentProfile/{studentId}").
		then().statusCode(200);	
	}
	
	@Test
	public void getQuote() {
	
		
		RestAssured.baseURI="https://got-quotes.herokuapp.com/quotes";
		
		given().queryParam("char", "tyrion").
		when().get("?char=tyrion").
		then().statusCode(200);
		
	}	
}
