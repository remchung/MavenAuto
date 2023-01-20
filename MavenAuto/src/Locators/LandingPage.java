package Locators;

import org.openqa.selenium.By;


public class LandingPage extends Page
{

	public LandingPage(String url, String title)
	{
		super(url, title);
		// TODO Auto-generated constructor stub
	}
	
	public By MyAccount = By.xpath("//*[.='My Account']");

}
