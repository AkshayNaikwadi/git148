package POM_DDF_TestNG_BaseClass_UtilityClass;

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
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

public class KiteLoginTest extends BaseClass
{

	KiteLogin1Page login1;
    KiteLogin2Page login2;
	KiteHomePage home;
	int TCID;
	
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException 
	{
		
	      intializeBrowser();
		 
	      login1=new KiteLogin1Page(driver1);
	      login2=new KiteLogin2Page(driver1);
		  home=new  KiteHomePage(driver1);
		
	}
	
	
	
   @BeforeMethod
	public void LogininApp() throws EncryptedDocumentException, IOException 
   {
	    login1.inpKiteLogin1PageUsername(UtilityClass.readDataFromPF("UN"));
		login1.inpKiteLogin1PagePassword(UtilityClass.readDataFromPF("PASSWORD"));
		login1.clickKiteLogin1PageLoginBtn();	 
       
        login2.inpKiteLogin2PagePin(UtilityClass.readDataFromPF("PIN"));
        login2.clickKiteLogin2PageCntBtn();
       
   
   }
	
  
	@Test
	public void VerifyUserID() throws EncryptedDocumentException, IOException 
	{
		TCID=100;
		Reporter.log("------------running verifyUserID Test case-------------",true);
		String expUserID="ZMY641";  //UtilityClass.getTestData(0, 3);
		String actUserID = home.getKiteHomePageProfileName();
		
		Assert.assertEquals(actUserID, expUserID,"Failed: both results are diffrent: ");
				   
	}
	
	
	
	@AfterMethod
	   public void LogoutFromApp(ITestResult result) throws IOException 
	   {
		
		if (result.getStatus()==ITestResult.FAILURE)
		{
	 
			UtilityClass.cpatureScreenShot1(driver1, TCID);
		
		}
		
		//home.clickonAAbtn();
		//home.clicklogoutbtn();
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
			 finalize();    //Garbage collector
			 
	   }
		
	
	
	
	
	
	
	
	
}
