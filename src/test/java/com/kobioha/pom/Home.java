package com.kobioha.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kobioha.base.TestBase;

public class Home extends TestBase{

	@FindBy(tagName = "h1")
	WebElement headertitle;
	
	@FindBy(xpath="//*[@id='option_3']/li[1]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id='option_3']/li[2]")
	WebElement email;
	
	@FindBy(xpath="//*[@id='option_3']/li[1]")
	WebElement address;
	
	@FindBy(xpath="")
	WebElement membership;

	@FindBy(xpath="//*[@id='option_3']/li[1]")
	WebElement coreMembership;
	
	@FindBy(xpath="//*[@id='option_3']/li[1]")
	WebElement contact;
	
	public Home()
	{
		PageFactory.initElements(getWebDriver(), this);
	}
	
	public void navigateToWebsite()
	{
		getWebDriver().get("https://wheelsup.com");
	}
	
	public WebElement getTitle()
	{
		return headertitle;
	}
	
	public WebElement getHeadertitle() {
		return headertitle;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getMembership() {
		return membership;
	}

	public WebElement getCoreMembership() {
		return coreMembership;
	}

	public WebElement getContact() {
		return contact;
	}
	
	
	
}
