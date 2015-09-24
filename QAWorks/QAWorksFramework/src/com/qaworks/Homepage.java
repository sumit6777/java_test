package com.qaworks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage 
{
	public static String url ="http://qaworks.com/";
	private Webpage webpage = new Webpage();
	private static String PageTitle ="Home Page - QAWorks";
	
	@FindBy(how = How.LINK_TEXT,using ="Contact")
	 private WebElement contact;

	public  boolean IsAt() 
	{
		return webpage.IsAt(PageTitle);
	}
	
	
	public void Goto() 
	{
		Browser.Goto(url);
		WebDriverWait wait = new WebDriverWait(Browser.webdriver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Contact")));
	}
	
	//@Override
	//public boolean IsAt(String PageTitle)
	//{
		// TODO Auto-generated method stub
		//return webpage.IsAt(PageTitle);
	//}
	
	public void navigateToContactPage() 
	{
		contact.click();
		Browser.webdriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
   
}
