package com.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.orangehrm.gererics.Base;

public class Recruitment_Candidates{

	public Recruitment_Candidates(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//for navigating to the candidate page
		//Mousehover to Recruitment option
		@FindBy(xpath="//a[@id='menu_recruitment_viewRecruitmentModule']")
		private WebElement recruitment;
		public void recruitment(WebDriver driver)
		{
			Actions a=new Actions(driver);
			a.moveToElement(recruitment).build().perform();
		}
		//Click on the candidate option in the list
		@FindBy(xpath="//a[text()='Candidates']")
		private WebElement candidates;
		public void candidates()
		{
			candidates.click();
		}
		//Click on the Add candidate button
		@FindBy(xpath="//input[@id='btnAdd']")
		private WebElement AddBTN;
		public void AddBTN()
		{
			AddBTN.click();
		}
		
		
		/*
		 * For Searching the Candidate 
		 */
		@FindBy(xpath="//input[@id='candidateSearch_candidateName']")
		private WebElement candidatename;
		public void enterCandidatename(String str)
		{
			candidatename.sendKeys(str);
		}
		@FindBy(id="candidateSearch_jobVacancy")
		private WebElement Vacancy;
		public void Vacancy()
		{
			Vacancy.click();
			Select s=new Select(Vacancy);
			s.selectByVisibleText("Software Engineer");
			
		}
		/*
		 * For Selecting from date
		 */
		@FindBy(xpath="//input[@id=\"candidateSearch_fromDate\"]")
		private WebElement fromdate;
		@FindBy(xpath="//select[@class='ui-datepicker-year']")
		private WebElement year;
		@FindBy(xpath="//select[@class='ui-datepicker-month']")
		private WebElement month;
		@FindBy(xpath="(//a[@class='ui-state-default'])[1]")
		private WebElement day;
		public void fromdate()
		{
			fromdate.click();
			Select s=new Select(year);
			year.click();
			s.selectByVisibleText("2021");
			Select s1=new Select(month);
			month.click();
			s1.selectByVisibleText("Nov");
			day.click();
		}
		@FindBy(xpath="//input[@id='btnSrch']")
		private WebElement search;
		public void search()
		{
			search.click();
		}
		@FindBy(xpath="((//div[@class='inner'])[2]//tr[1])[2]//td[3]")
		private WebElement first_candidate_in_list;
		public String searched_candidate_from_list()
		{
			String str1=first_candidate_in_list.getText();
			return str1;
		}
		
}
