package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	WebDriver driver1;
	//FIRST METHOD
	public void intializeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"E:\\chromedriver.exe");	
		 
		driver1 =new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get(UtilityClass.readDataFromPF("URL"));
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	
	
}
