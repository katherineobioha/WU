package com.kobioha.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kobioha.base.TestBase;

public class CoreMembership extends TestBase {

	
	@FindBy(tagName = "h1")
	WebElement frame;
	

	@FindBy(tagName = "//*[@id='ways_to_fly-component-8']/app-module-title/div/h1")
	WebElement easymembershiptext;
	
	@FindBy(tagName = "//*[@id='ways_to_fly-component-8']/app-module-title/div/p/")
	WebElement onetimefee;
	
	@FindBy(tagName = "//*[@id='soft_footer-component']/div[3]/div/div[1]/app-module-title/div/h1")
	WebElement learnmoretoday;
	
	@FindBy(id = "link-0.21078839876727562")
	WebElement continuebutton;
	
	@FindBy(id = "FirsttName-clone")
	WebElement formfirstname;
	
	@FindBy(id = "LastName-clone")
	WebElement formlastname;
	
	
	public CoreMembership()
	{
		PageFactory.initElements(getWebDriver(), this);
	}
	
	public WebElement getFrame() {
		return frame;
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
