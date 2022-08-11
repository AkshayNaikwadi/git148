

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_XpathByAttribute {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", 
			"F:\\chromedriver.exe\\");
	
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://en-gb.facebook.com/");
	
	
	//enter UN
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9999999999");
	
	//enter pwd
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xyz@12345");
	
	//click on login btn
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
}
}