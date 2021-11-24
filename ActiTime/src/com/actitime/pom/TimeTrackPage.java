package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TimeTrackPage {

	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement tasks;
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;

	public TimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void tasks()
	{
		tasks.click();
	}
	public void logout()
	{
		logout.click();
	}
}
