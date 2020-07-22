package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {
	
	@Test
	public void test1() throws InterruptedException
	{
		System.out.println("before");
		System.setProperty("webdriver.gecko.driver","C:\\Users\\xyz\\workspace\\Framework\\Drivers\\geckodriver.exe");
		System.out.println("afeter");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://freecrm.com");
		driver.get("https://classic.crmpro.com/login.cfm");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.quit();
	}

}
