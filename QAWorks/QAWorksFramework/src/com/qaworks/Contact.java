package com.qaworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Contact  
{
	private static String PageTitle = "Contact Us - QAWorks";
	private Webpage webpage = new Webpage();
	
	@FindBy(how = How.ID,using ="ctl00_MainContent_NameBox")
	private WebElement name;
	@FindBy(how = How.ID,using ="ctl00_MainContent_EmailBox")
	private WebElement email;
	@FindBy(how = How.ID,using ="ctl00_MainContent_MessageBox")
	private WebElement message;
	@FindBy(how = How.ID,using ="ctl00_MainContent_SendButton")
	private WebElement send;
	

	public  boolean IsAt() 
	{
		return webpage.IsAt(PageTitle);
	}
	
	public void enterContactForm(String nameval, String emailval, String messageval)
	{
		name.sendKeys(nameval);
		email.sendKeys(emailval);
		message.sendKeys(messageval);
		send.click();
		WebDriverWait wait = new WebDriverWait(Browser.webdriver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_MainContent_NameBox")));
	}
	
}
