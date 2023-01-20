package TestCase;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Locators.*;

public class test01 {
	
	public ChromeOptions options = new ChromeOptions();
	
	public WebDriver webDriver = new ChromeDriver(options);
	
	//public Page Page = new Page();
	
  
  @Test
  public void GotoLandingpPage() 
  {
	// Go to URL
	  webDriver.get("https://practice.automationtesting.in/"); 
	  
	// Wait for page to load
	  
	  	  
	// Click on MyAccount
	  webDriver.findElement(Page.Landing.MyAccount).click();
	  
	// 	  
	  
  }
  
@BeforeMethod
  
  public void beforeMethod() 
  {	  	
	  	webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
		options.addArguments("--start-maximized");

		options.setAcceptInsecureCerts(true);

		String window = webDriver.getWindowHandle();

		webDriver.switchTo().window(window);		
  }
	
  @AfterMethod
	
	public void AfterMethod() {
		
	  webDriver.close();
		
	}	
}
