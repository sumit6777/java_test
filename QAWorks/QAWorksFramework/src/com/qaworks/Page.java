package com.qaworks;

import org.openqa.selenium.support.PageFactory;

public class Page 
{
	public static Homepage homepage()
	 {
		 Homepage homepage = new Homepage();
		 PageFactory.initElements(Browser.Driver(),homepage);
		 return homepage;
	 }
	
	public static Contact contact()
	 {
		 Contact contact = new Contact();
		 PageFactory.initElements(Browser.Driver(),contact);
		 return contact;
	 }
}
