package ssb;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restAssuredRequests {
	@Test
	public void createResource() {
		// To initiate the payload
		String requestBody = "{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";

		RequestSpecification request =RestAssured.given();
		request.header("contentType","application/json");
		//to send the request and capture the response will
		//Response response= request.post("https://reqres.in/api/users");
		Response response= request.put("https://reqres.in/api/users/2");
		//to print the response and status code
		int statusCode = response.getStatusCode();
		 System.out.println("status code is"+statusCode);
		 String responseBody = response.getBody().asString();
		 System.out.println("Response body is "+responseBody);
		 }}
