package Generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public abstract class Base_page {

	public void verifytitle(WebDriver driver,String title) throws IOException
	{
		Screenshot s= new Screenshot();
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("Title is matching",true);
		s.Pass_case();
		}
		catch(Exception e)
		{
			Reporter.log("Title is not matching",true);
			s.Fail_case();
			Assert.fail();
		}
		
		

	}
	
	}

