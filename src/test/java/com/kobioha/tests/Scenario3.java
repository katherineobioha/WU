package com.kobioha.tests;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jdk.nashorn.internal.parser.JSONParser;

public class Scenario3 {
	
	String twitter = "https://twitter.com/WheelsUp";
	String instagram = "http://instagram.com/wheelsup8760";
	
	@Test
	public void verifySocialAccounts()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://marketingapi.wheelsup.com/api/initial-data";

		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();

		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "");

		JsonPath jsonPathValidator = response.jsonPath();
		HashMap ma =jsonPathValidator.getJsonObject("keys");
		//System.out.println(jsonPathValidator.getJsonObject("keys").toString());
		Iterator<Map.Entry>itr1 = ma.entrySet().iterator();
		while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            if(pair.getKey().equals("twitter"))
            {
            	Assert.assertEquals(pair.getValue(), twitter);
            }
            else if(pair.getKey().equals("instagram"))
            {
            	Assert.assertEquals(pair.getValue(), instagram);
            }
            System.out.println(pair.getKey() + " : " + pair.getValue()); 
        } 
	}


}
