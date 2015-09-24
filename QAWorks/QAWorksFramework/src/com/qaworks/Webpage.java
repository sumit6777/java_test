package com.qaworks;

public class Webpage implements IWebpage
{
	public  boolean IsAt(String PageTitle)
	{
		System.out.println(Browser.Title());
		return Browser.Title().equals(PageTitle);
	}
}
