package com.orangehrm.gererics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.pom.DashboardPage;
import com.orangehrm.pom.LoginPage;

public class Base {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeClass
	public static void OpenBrowser() throws IOException
	{
		String URL=Filelib.readPropertyfiledata("url");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@BeforeMethod
	public static void Login() throws IOException, InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		String un=Filelib.readPropertyfiledata("username");
		lp.PassUserName(un);
		String ps=Filelib.readPropertyfiledata("password");
		Thread.sleep(2000);
		lp.PassPassword(ps);
		lp.ClickOnLogin();
		Thread.sleep(5000);
	}
	@AfterMethod
	public static void Logout()
	{
		DashboardPage dp=new DashboardPage(driver);
		dp.welcomeoption();
		dp.Logoutoption();
	}
	@AfterClass
	public static void CloseBrowser()
	{
		driver.close();
	}
}
