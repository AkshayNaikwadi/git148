import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot 
{
private static String akshay;
private static final String name = akshay;

public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", 
			"E:\\chromedriver.exe");	
	 
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://kite.zerodha.com/");
     
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	String name = AKSHAY;
	File destination=new File("E:\\screenshot\\"+name+".jpg");

     FileHandler.copy(src, destination);
}


}


