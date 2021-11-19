package testingmaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Openyoutube 
{
	static
	{
	System.setProperty("webdriver.gecko.driver", "./src/test/geckodriver.exe");
	}
	@Test
	public void tc_3()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.youtube.com");
		
	}
}
