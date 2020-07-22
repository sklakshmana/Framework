package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	//This is Changes from Lakshman
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(name="username") WebElement username;
	
	@FindBy(name="password") WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-small']") WebElement loginButton;
	
	public void loginToCRM(String uname, String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}
	
}
