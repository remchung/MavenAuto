package Locators;

public class Page
{

	public Page(String url, String title) 
	{		
		this.url = url;
		this.title = title;				
	}
	
	public String url;
	
	public String title;
	
	
	
	
	
	
	public static LandingPage Landing = new LandingPage("{0}","Automation Practice Site");
	
}
