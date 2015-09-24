package com.qaworks;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Browser
{
	
	    static WebDriver webdriver;// = new FirefoxDriver();
		public static void Goto(String url) 
		{
			 File file = new File("C:\\Utilities\\chromedriver_win32\\chromedriver.exe");
			 System.setProperty("webdriver.chrome.driver", file.getAbsolutePath() );
			 webdriver=  new ChromeDriver();
			 webdriver.get(url);
		}
		public static String Title() {
			
			return webdriver.getTitle();
		}
		public static void close()
		{
		 webdriver.quit();	
		}
		public static WebDriver Driver() {
			return webdriver;
		}

	}