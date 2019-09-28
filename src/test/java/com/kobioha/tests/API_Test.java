package com.kobioha.tests;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import jdk.nashorn.internal.parser.JSONParser;

public class API_Test {
	
	String twitter = "https://twitter.com/WheelsUp";
	String instagram = "http://instagram.com/wheelsup8760";
	
	@DataProvider(name = "social-accounts")
    public Object[][] dataProviderMethod() {
        return new Object[][] { { twitter, instagram } };
    }
	
	@Test(dataProvider = "social-accounts")
	public void verifySocialAccounts(String tweet, String ig)
	{   
		// base URI
		RestAssured.baseURI = "http://marketingapi.wheelsup.com/api/initial-data";

		RequestSpecification httpRequest = RestAssured.given();

		
		Response response = httpRequest.request(Method.GET, "");

		JsonPath jsonPathValidator = response.jsonPath();
		HashMap ma =jsonPathValidator.getJsonObject("keys");
		//System.out.println(jsonPathValidator.getJsonObject("keys").toString());
		Iterator<Map.Entry>itr1 = ma.entrySet().iterator();
		while (itr1.hasNext()) { 
            Map.Entry pair = itr1.next(); 
            if(pair.getKey().equals("twitter"))
            {
            	Assert.assertEquals(pair.getValue(), tweet);
            	System.out.println(pair.getKey() + " : " + pair.getValue());
            }
            else if(pair.getKey().equals("instagram"))
            {
            	Assert.assertEquals(pair.getValue(), ig);
            	System.out.println(pair.getKey() + " : " + pair.getValue());
            }
             
        } 
	}


}
