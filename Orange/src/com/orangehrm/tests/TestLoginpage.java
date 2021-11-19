package com.orangehrm.tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.gererics.Base;
import com.orangehrm.pom.DashboardPage;

@Listeners
public class TestLoginpage extends Base{

	@Test
	public static void main() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String currenturl=driver.getCurrentUrl();
		Reporter.log(currenturl, true);
		String expectedurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(currenturl, expectedurl);
	}
}
