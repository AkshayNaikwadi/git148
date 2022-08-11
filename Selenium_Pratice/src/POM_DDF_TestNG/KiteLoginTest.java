package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTest
{
	WebDriver driver1;
	KiteLogin1Page login1;
	Sheet sh;
	KiteLogin2Page login2;
	KiteHomePage home;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("F:\\testdata.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", 
				"F:\\chromedriver.exe\\");	
		 
		driver1 =new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://kite.zerodha.com/");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 login1=new KiteLogin1Page(driver1);
	     login2=new KiteLogin2Page(driver1);
		 home=new  KiteHomePage(driver1);
		
	}
	
	
	
   @BeforeMethod
	public void LogininApp() 
   {
	   login1.inpKiteLogin1PageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login1.inpKiteLogin1PagePassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.clickKiteLogin1PageLoginBtn();	 
       
       login2.inpKiteLogin2PagePin(sh.getRow(0).getCell(2).getStringCellValue());
       login2.clickKiteLogin2PageCntBtn();
       
   
   }
	
  
	@Test
	public void VerifyUserID() 
	{
		Reporter.log("------------running verifyUserID Test case-------------",true);
		String expUserID=sh.getRow(0).getCell(3).getStringCellValue();
		String actUserID = home.getKiteHomePageProfileName();
		
		Assert.assertEquals(actUserID, expUserID,"Failed: both results are diffrent: ");
				   
	}
	
	
	
	@AfterMethod
	   public void LogoutFromApp() 
	   {
		home.clickAAbtn();
		home.clicklogoutbtn();
	   }
		
	

	   @AfterClass
		public void Closebrowser() throws Throwable 
	   {
			 Thread.sleep(5000);
		     //driver1.close();
//			 driver1=null;
//			 login1=null;
//		     login2=null;
//             home=null;
			 finalize();
			 
	   }
		
	
	
	
	
	
	
	
	
}
