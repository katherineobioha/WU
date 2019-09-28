package com.kobioha.tests;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.kobioha.base.TestBase;
import com.kobioha.pom.*;

public class Selenium_Test {

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
	@Test(priority =0)
	public void homepage()
	{
		home.navigateToWebsite("https://wheelsup.com");
		System.out.println(home.selectElements(home.getTitle()));
		System.out.println(home.scrollToElement("DOWN", home.getPhoneNumber()));
		System.out.println(home.selectElements(home.getEmail()));
		System.out.println(home.selectElements(home.getAddress()));
		Sleeper.sleepTightInSeconds(1);
	}
	
	@Test(priority =1)
	public void navigatePage()
	{
		home.ScrollToTop();
	
		home.ClickOnElements(home.getMembership());
		new SoftAssert().assertEquals(home.ClickOnElements(home.getCoreMembership()), true);
		
		coremembership.scrollToElement("DOWN", coremembership.getEasymembershiptext());
		Assert.assertEquals("one-time initiation fee",coremembership.parseAndSearchString("ONE-TIME INITIATION FEE", coremembership.getOnetimefee()));
		coremembership.scrollToElement("down", coremembership.getLearnmoretoday());
		
	}
	
	@Test(priority =2)
	public void fillform()
	{
		new SoftAssert().assertEquals(coremembership.SendKeysToElement("kat", coremembership.getFormfirstname()), true);
		coremembership.SendKeysToElement("obioha", coremembership.getFormlastname());
		Sleeper.sleepTightInSeconds(3);
	}
	
	@AfterTest
	public void aftertest()
	{
		base.quitdriver();
	}
}
