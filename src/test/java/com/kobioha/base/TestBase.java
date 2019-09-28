package com.kobioha.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {

	private static WebDriver driver;
	
	WebDriverWait wait;
	
	public WebDriver getWebDriver()
	{
		return this.driver;
	}
	
	public boolean navigateToWebsite(String url)
	{
		getWebDriver().get(url);
		return true;
	}
	public boolean createDriver()
	{
		if(driver==null)
		{
			System.setProperty("webdriver.chrome.driver", "Drivers//chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
			this.driver = new ChromeDriver(options);
			this.driver.manage().window().maximize();
		}
		else
		{
			return false;
		}
		return true;
	}
	
	public boolean SendKeysToElement(String keys, WebElement elem)
	{
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		elem.sendKeys(keys);
		return true;
	}
	
	public boolean ClickOnElements(WebElement elem)
	{
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		if(elem.isDisplayed() && elem.isEnabled())
		{
			elem.click();
			return true;
		}
		else
		{
			System.out.println("Could not find elem" + elem);
			return false;
		}
		
	}
	
	public void ScrollToTop()
	{
		((JavascriptExecutor) this.driver).executeScript("window.scrollTo(0,0)");
	}
	
	public String scrollToElement(String pos, WebElement elem)
	{
		wait = new WebDriverWait(this.driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		if(pos.equalsIgnoreCase("down"))
		{
			Actions act = new Actions(this.driver);
			act.moveToElement(elem).click();
			act.sendKeys(Keys.PAGE_DOWN).perform();
			act.moveToElement(elem).click();
		}
		else
		{
			Actions act = new Actions(this.driver);
			act.moveToElement(elem).click();
			act.sendKeys(Keys.PAGE_UP).perform();
			act.moveToElement(elem).click();
		}
		
		return elem.getText();
	}
	
	public String parseAndSearchString(String s, WebElement onetimefee)
	{
		Sleeper.sleepTightInSeconds(3);
		for(int i =0; i<onetimefee.getText().length(); i++)
		{
			System.out.println();
		}
		return onetimefee.getText();
	}
	
	public String selectElements(WebElement elem)
	{
		wait = new WebDriverWait(this.driver,15 );
		wait.until(ExpectedConditions.elementToBeClickable(elem));
		if(elem.isDisplayed())
		{
			return elem.getText();
		}
		else
		{
			System.out.println("Could not find elem" + elem);
			return "null";
		}
	}
	public void quitdriver()
	{
		this.driver.quit();
	}
}
