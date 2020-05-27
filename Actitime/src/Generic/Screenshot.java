package Generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Base_Test implements Auto_constant {
	//WebDriver driver;
	void Pass_case() throws IOException
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("DD-MM-YYYY HH-mm-SS");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(Passcase+sdf.format(d)+".png");	
		FileHandler.copy(src, dst);
		
	}
	void Fail_case() throws IOException
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("DD-MM-YYYY HH-mm-SS");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(Failcase+sdf.format(d)+".png");	
		FileHandler.copy(src, dst);

}
}
