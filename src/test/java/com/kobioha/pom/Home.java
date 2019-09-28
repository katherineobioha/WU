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
	
	@FindBy(xpath="/html/body/app-root/div/app-footer/footer/div/div[1]/div/div[4]/div/ul/li/span")
	WebElement address;
	
	@FindBy(xpath="/html/body/app-root/div/app-menu/div/div[2]/div/div/div[1]/div/nav/ul/li[1]/app-menu-item/div/a/")
	WebElement membership;

	@FindBy(xpath="/html/body/app-root/div/app-menu/div/div[2]/div/div/div[1]/div/nav/ul/li[1]/app-menu-item/div/ul/li[2]/a")
	WebElement coreMembership;
	
	@FindBy(xpath="//*[@id='option_3']/li[1]")
	WebElement contact;
	
	public Home()
	{
		PageFactory.initElements(getWebDriver(), this);
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
