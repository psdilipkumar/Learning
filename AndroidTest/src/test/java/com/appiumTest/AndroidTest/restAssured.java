package com.appiumTest.AndroidTest;

import static io.restassured.RestAssured.given;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class restAssured {
	//@Test
	public void Test1() {
		given().
			get("http://services.groupkt.com/country/get/iso2code/US").
		then().
			statusCode(200).
			log().all();
	}

	@Test
	public void Test2() {
		RestAssured.baseURI= "http://restapi.demoqa.com/utilities/weather/city";
		Response response = RestAssured.get("/Hyderabad");
		//String body = response.asString();
		ResponseBody body= response.getBody();
		System.out.println(body.asString());
		//int code= response.statusCode();
		//System.out.println(code);
		//System.out.println(response.getTime());
		
		JsonPath jp= response.jsonPath();
		System.out.println(jp.get("$.City[0]"));
		//String City=jp.get("City");
		//System.out.println(City);
	}
	
	//@Test
	public void Test3() {
		RestAssured.baseURI ="http://restapi.demoqa.com/customer";
		RequestSpecification request = RestAssured.given();
	 
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName", "psDilip"); // Cast
		requestParams.put("LastName", "Kumar");
		requestParams.put("UserName", "psdilipkumar4");
		requestParams.put("Password", "password");
	 
		requestParams.put("Email",  "psdilipkumar4@gmail.com");
		System.out.println(requestParams.toString());
		request.body(requestParams.toString());
		Response response = request.post("/register");
	 
		ResponseBody body= response.getBody();
		System.out.println(body.asString());
		int statusCode = response.getStatusCode();
		Assert.assertEquals(statusCode, 201);
		String successCode = response.jsonPath().get("SuccessCode");
		Assert.assertEquals( "OPERATION_SUCCESS", successCode, "OPERATION_SUCCESS");
	}
}
