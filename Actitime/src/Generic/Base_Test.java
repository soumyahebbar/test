package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements Auto_constant
{
	WebDriver driver;
	@BeforeMethod
	public void Openapplication()
	{
		System.setProperty(Chrome_Key, Chrome_Value);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}


	@AfterMethod
		public void Closeapplication()
	{
		
		driver.close();
	}
}
