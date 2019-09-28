package com.kobioha.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kobioha.base.TestBase;

public class CoreMembership extends TestBase {

	
	@FindBy(tagName = "h1")
	WebElement frame;


	@FindBy(xpath = "//*[@id='ways_to_fly-component-8']/app-module-title/div")
	WebElement easymembershiptext;
	
	@FindBy(xpath = "//*[@id='ways_to_fly-component-8']/app-module-title/div/p")
	WebElement onetimefee;
	
	@FindBy(xpath = "//*[@id='soft_footer-component']/div[3]/div/div[1]/app-module-title/div")
	WebElement learnmoretoday;
	
	@FindBy(xpath = "//*[@id='link-0.8977247746334571']")
	WebElement continuebutton;
	
	@FindBy(id = "link-0.27671291136383447")
	WebElement request;
	

	@FindBy(id = "FirstName-clone")
	WebElement formfirstname;
	
	@FindBy(id = "LastName-clone")
	WebElement formlastname;
	
	
	public CoreMembership()
	{
		PageFactory.initElements(super.getWebDriver(), this);
	}
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getRequest() {
		return request;
	}
	
	public WebElement getEasymembershiptext() {
		return easymembershiptext;
	}

	public WebElement getOnetimefee() {
		return onetimefee;
	}

	public WebElement getLearnmoretoday() {
		return learnmoretoday;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public WebElement getFormfirstname() {
		return formfirstname;
	}

	public WebElement getFormlastname() {
		return formlastname;
	}

}
