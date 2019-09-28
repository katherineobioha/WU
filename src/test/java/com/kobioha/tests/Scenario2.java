package com.kobioha.tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kobioha.base.TestBase;
import com.kobioha.pom.*;

public class Scenario2 {

	Home home;
	CoreMembership coremembership;
	TestBase base;
	
	@BeforeTest
	public void setup()
	{
		base = new TestBase();
		base.createDriver();
		home = new Home();
		coremembership = new CoreMembership();
		
	}
	@Test
	public void test1()
	{
		home.navigateToWebsite("https://wheelsup.com");
		System.out.println(home.selectElements(home.getTitle()));
		System.out.println(home.scrollToElement("DOWN", home.getPhoneNumber()));
		System.out.println(home.selectElements(home.getEmail()));
		System.out.println(home.selectElements(home.getAddress()));
		Sleeper.sleepTightInSeconds(1);
	}
	
	@Test
	public void test2()
	{
		home.ScrollToTop();
		home.ClickOnElements(home.getMembership());
		home.ClickOnElements(home.getCoreMembership());
		coremembership.scrollToElement("down", coremembership.getEasymembershiptext());
		System.out.println(coremembership.parseAndSearchString("ONE-TIME INITIATION FEE", coremembership.getOnetimefee()));
		coremembership.scrollToElement("down", coremembership.getLearnmoretoday());
		coremembership.ClickOnElements(coremembership.getContinuebutton());
	}
	
	@Test
	public void fillform()
	{
		coremembership.SendKeysToElement("kat", coremembership.getFormfirstname());
		coremembership.SendKeysToElement("obioha", coremembership.getFormfirstname());
	}
	
	@AfterTest
	public void aftertest()
	{
		base.quitdriver();
	}
}
