package com.actitime.test;

import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.actitime.generics.Base;
import com.actitime.generics.Filelib;
import com.actitime.generics.Webdriverwait;
import com.actitime.pom.TasksPage;
import com.actitime.pom.TimeTrackPage;
@Listeners
public class TestCreateCustomer extends Base{

	@Test(enabled=true,priority=0,groups={"smoketesting"})
	@Parameters("testdata")
	public void customerCreation(String testdata) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TimeTrackPage ttp=new TimeTrackPage(driver);
		ttp.tasks();
		TasksPage tp=new TasksPage(driver);
		tp.addNewButton();
		tp.newCustomer();
		TreeMap<String, String> data = Filelib.xmlData(testdata);
		WebElement element = tp.customername();
		Webdriverwait.visibilityElement(driver, element);
		
		tp.customerName(data.get("customername"));
		
		tp.description(data.get("description"));
		tp.clickCustomer();
		tp.selectCustomer();
		tp.createCustomer();
		WebElement c=tp.customerInList();
		Webdriverwait.visibilityElement(driver, c);
		
		String s=tp.createdCustomer();
		
		Assert.assertEquals(s,data.get("customername"));
	}
	@Test(enabled=true,priority=1,groups= {"smoketesting"})
	@Parameters("testdata")
	public void deletionOfCustomer(String testdata) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		TasksPage tp=new TasksPage(driver);
		TimeTrackPage ttp=new TimeTrackPage(driver);
		ttp.tasks();
		tp.clickingcreatedCustomer();
		String s1=tp.createdCustomer();
		WebElement c=tp.customerInList();
		Webdriverwait.visibilityElement(driver, c);
		
		TreeMap<String, String> data = Filelib.xmlData(testdata);
		Assert.assertEquals(s1, data.get("customername"));
		tp.deleting_of_the_Customer();
	}
}
