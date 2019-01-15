package ToolsQA;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetTest {

	@Test
	public void GetWeatherDetails() {
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httprequest = RestAssured.given().contentType("application/json");
		//line 17 can be written as line line 18
		Response response = httprequest.request(Method.GET,"/Hyderabad"); 
		System.out.println("Response Body is :"+response.getBody().asString());
		response = httprequest.get("/Hyderabad");
		System.out.println("Response Body is :"+response.getBody().asString());
		String statusLine = response.getStatusLine();
		System.out.println("Status Line is : " + statusLine);
		ResponseBodi respBody = response.getBody().as(ResponseBodi.class);
		Assert.assertEquals(respBody.City, "Hyderabad");
		System.out.println("Weather Description : "+respBody.WeatherDescription);
	}
	@Test
	public void PostRequestCustomer() {
		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RequestSpecification httpRequest = RestAssured.given();
		JSONObject requestParams = new JSONObject();
		requestParams.put("FirstName","jatin");
		 requestParams.put("LastName", "Singh");
		 requestParams.put("UserName", "s2011");
		 requestParams.put("Password", "paword1");
		 requestParams.put("Email",  "saail.com");
		//httpRequest.header("Content-Type","application/json");
		httpRequest.body(requestParams.toJSONString());
		Response response = httpRequest.put("/register");
		int statusCode = response.getStatusCode();
		System.out.println("Response is :--->"+response.getBody().asString());
		Assert.assertEquals(statusCode, 201);
		Assert.assertEquals("Cuccess code match!!!",response.jsonPath().get("SuccessCode"), "OPERATION_SUCCESS");
	}
}
