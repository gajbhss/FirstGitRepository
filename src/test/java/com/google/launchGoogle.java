package com.google;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchGoogle {
	
	WebDriver driver;
	
	@Test
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/sanketgajbhiv/Downloads/Sanket_Doc/Sanket_Joining_Documents/Scanned Copy/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("End");
		driver.quit();
		System.out.println("S");
	}

}
