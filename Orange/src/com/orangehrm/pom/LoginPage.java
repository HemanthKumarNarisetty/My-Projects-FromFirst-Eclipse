package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement username;
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement password;
	@FindBy(xpath="//input[@class='button']")
	private WebElement LoginBTN;
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void PassUserName(String usernameValue)
	{
		username.sendKeys(usernameValue);
	}
	public void PassPassword(String passwordvalue)
	{
		password.sendKeys(passwordvalue);
	}
	public void ClickOnLogin()
	{
		LoginBTN.click();
	}
}
