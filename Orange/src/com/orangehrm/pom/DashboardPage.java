package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DashboardPage {

	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcome;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void welcomeoption()
	{
		welcome.click();
	}
	public void Logoutoption()
	{
		Logout.click();
	}
}
