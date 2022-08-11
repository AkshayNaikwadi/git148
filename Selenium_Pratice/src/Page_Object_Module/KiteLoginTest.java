package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.HomeBaseWarning;

//Test class
public class KiteLoginTest
{
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", 
			"F:\\chromedriver.exe\\");
	
	WebDriver driver1 =new ChromeDriver();
	
	driver1.manage().window().maximize();
	
	driver1.get("https://kite.zerodha.com/");
	
	driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	KiteLogin1Page login1=new KiteLogin1Page(driver1);
	login1.inpKiteLogin1PageUsername(username);
	login1.enterPWD();
	login1.clickOnLoginBtn();
	
	KiteLogin2Page login2 =new KiteLogin2Page(driver1);
	login2.enterPin();
	login2.clickOnContinueBtn();
		
	KiteHomePage home=new KiteHomePage(driver1);
	home.verifyProfileName();
	
	Thread.sleep(3000);
	
	driver1.close();
		
}
}