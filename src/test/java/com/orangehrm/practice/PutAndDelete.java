package com.orangehrm.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PutAndDelete {

	//@Test
	public void putStudent() {
		Map<String, Object> map = new LinkedHashMap();

		map.put("id", 0);
		map.put("firstName", "Karina");
		map.put("lastName", "Mike");
		map.put("age", 48);
		map.put("batch", 5);
		map.put("batchStartDate", "2019-09-09");
		map.put("batchEndDate", "2020-09-08");
		map.put("course", "Selenium");
		map.put("attendanceNature", "online");
		map.put("streetAddress", "543 Diego");
		map.put("city", "San Diego");
		map.put("state", "CA");
		map.put("zipCode", "34543");

		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";

		Response response = given().accept(ContentType.JSON).header("Content-Type", "application/json").body(map).when()
				.put("/api/updateStudentProfile");

		response.then().assertThat().statusCode(200);

		response.prettyPrint();

		int studentId = response.jsonPath().get("id");
		System.out.println(studentId);

		Map<String, Object> responseMap = response.as(Map.class);
		System.out.println(responseMap);

	}

	@Test
	public void deleteStudent() {

		RestAssured.baseURI = "https://pure-ravine-92491.herokuapp.com/syntax";
		Response response = given().pathParam("studentId", "431"). 
				when().delete("/api/deleteStudentProfile/{studentId}");
		response.then().assertThat().statusCode(200);
		response.prettyPrint();

	}
}
