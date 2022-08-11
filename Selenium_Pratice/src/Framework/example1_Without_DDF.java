package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Without_DDF {
public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
			"F:\\chromedriver.exe\\");
	//concept
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//enter UN
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("DV1510");

	//enter PWD
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pass@123");
	
	//click on login btn
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	
	//enter Pin
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("959594");
	
	//click on continue btn
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	//get user ID
	String expUserID="DV1510";
	String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
	if(actUserID.equals(expUserID))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
}
}