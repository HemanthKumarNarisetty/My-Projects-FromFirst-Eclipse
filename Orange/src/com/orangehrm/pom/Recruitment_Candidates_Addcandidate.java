package com.orangehrm.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.gererics.Base;

public class Recruitment_Candidates_Addcandidate extends Base {
	
	public Recruitment_Candidates_Addcandidate(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//for Adding the candidate, form need to fill by this elements
	@FindBy(xpath="//input[@id='addCandidate_firstName']")
	private WebElement firstname;
	public void firstname(String str)
	{
		firstname.sendKeys(str);
	}
	@FindBy(xpath="//input[@id='addCandidate_middleName']")
	private WebElement middleName;
	public void middleName(String str)
	{
		middleName.sendKeys(str);
	}
	@FindBy(xpath="//input[@id='addCandidate_lastName']")
	private WebElement lastName;
	public void lastName(String str)
	{
		lastName.sendKeys(str);
	}
	@FindBy(xpath="//input[@id='addCandidate_email']")
	private WebElement email;
	public void email(String str)
	{
		email.sendKeys(str);
	}
	@FindBy(xpath="//input[@id='addCandidate_contactNo']")
	private WebElement contactno;
	public void contactno(String str)
	{
		contactno.sendKeys(str);
	}
	@FindBy(id="addCandidate_vacancy")
	private WebElement Job_Vacancy;
	
	//For selecting the options in the Job vacany dropdown
	 public void select_JobVacanyItem()
	 {
		 Job_Vacancy.click();
		 Select sel=new Select(Job_Vacancy);
		 sel.selectByVisibleText("Software Engineer");
	 }
	 
	 //For uploading the Resume from the device
	@FindBy(xpath="//input[@id='addCandidate_resume']")
	private WebElement resume_upload;
	public void resume_upload(String str)
	{
		resume_upload.sendKeys(str);
	}
	//For selecting the year in the Date of Application
	@FindBy(xpath="//input[@id='addCandidate_appliedDate']")
	private WebElement Date_of_Application;
	public void Date_of_Application()
	{
		Date_of_Application.click();
	}
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement year;
	public void Select_Year()
	{
		year.click();
		Select s=new Select(year);
		s.selectByVisibleText("2021");
	}
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement month;
	public void Select_month()
	{
		month.click();
		Select s2=new Select(month);
		s2.selectByVisibleText("Nov");
	}
	@FindBy(xpath="(//a[@class='ui-state-default'])[1]")
	private WebElement date;
	public void select_Date()
	{
		date.click();
	}
	@FindBy(xpath="(//input[@type='button'])[5]")
	private WebElement save;
	public WebElement savebutton()
	{
		return save;
	}
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement Consenttokeepdata;
	
	public void save()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+save+")");
		Consenttokeepdata.click();
		save.submit();
	}
}
