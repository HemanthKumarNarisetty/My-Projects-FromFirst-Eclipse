package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.actitime.pom.LoginPage;

public class Base {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public static void OpenBrowser(String browser) throws IOException
	{
		String URL=Filelib.readPropertyfiledata("url");
		if(browser.equals("chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
			driver=new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(URL);
	}
	@BeforeMethod
	public static void Login() throws IOException
	{
		String un=Filelib.readPropertyfiledata("username");
		String pw=Filelib.readPropertyfiledata("password");
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(un);
		lp.setPassword(pw);
		lp.login();
		
	}
	@AfterMethod
	public static void Logout()
	{
		
	}
	@AfterClass
	public static void CloseBrowser()
	{
		driver.close();
	}
}
