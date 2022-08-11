package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HomeBaseWarning;

//Test class
public class KiteLoginTest
{
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	
	FileInputStream file=new FileInputStream("F:\\testdata.xlsx\\");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
	System.setProperty("webdriver.chrome.driver", 
			"F:\\chromedriver.exe");	
	WebDriver driver1 =new ChromeDriver();
	
	driver1.manage().window().maximize();
	
	driver1.get("https://kite.zerodha.com/");
	
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	KiteLogin1Page login1=new KiteLogin1Page(driver1);
	
	String UNValue = sh.getRow(0).getCell(0).getStringCellValue();
	login1.inpKiteLogin1PageUsername(UNValue);
	
	String PWDValue = sh.getRow(0).getCell(1).getStringCellValue();
	login1.inpKiteLogin1PagePassword(PWDValue);
	
	login1.clickKiteLogin1PageLoginBtn();
	
	//---------------------------------------------
	
	KiteLogin2Page login2 =new KiteLogin2Page(driver1);
	
	String PinValue = sh.getRow(0).getCell(2).getStringCellValue();
	login2.inpKiteLogin2PagePin(PinValue);
	
	login2.clickKiteLogin2PageCntBtn();
		
	KiteHomePage home=new KiteHomePage(driver1);
	
	String expIserID = sh.getRow(0).getCell(3).getStringCellValue();
	home.verifyKiteHomePageProfileName(expIserID);
	
	Thread.sleep(3000);
	
	driver1.close();
		
}
}