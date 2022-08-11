package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.events.EventException;

public class example2_With_DDF {
public static void main(String[] args) throws EventException, IOException {
		
	FileInputStream file=new FileInputStream("F:\\testdata.xlsx\\");
     Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
     System.setProperty("webdriver.chrome.driver", 
    		 "F:\\chromedriver.exe\\");
	
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://kite.zerodha.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	//enter UN
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);

	//enter PWD
	String password = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	
	//click on login btn
	driver.findElement(By.xpath("//button[text()='Login ']")).click();
	
	//enter Pin
	String pin = sh.getRow(0).getCell(2).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	
	//click on continue btn
	driver.findElement(By.xpath("//button[text()='Continue ']")).click();
	
	//get user ID
	String expUserID=sh.getRow(0).getCell(3).getStringCellValue();
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