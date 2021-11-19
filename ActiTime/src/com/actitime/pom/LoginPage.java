package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='username']")
	private WebElement userName;
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void userName(String str)
	{
		userName.sendKeys(str);
	}
	public void password(String str)
	{
		password.sendKeys(str);
	}
	public void login()
	{
		login.click();
	}
}
