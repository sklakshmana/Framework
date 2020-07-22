package com.learnautomation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String appURL)
	{
		if(browserName.contains("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\xyz\\workspace\\Framework\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.contains("Chrome"))
		{
			
		}
		else if(browserName.contains("IE"))
		{
			
		}
		else 
		{
			System.out.println("We do not support this browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		
		return driver;
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
