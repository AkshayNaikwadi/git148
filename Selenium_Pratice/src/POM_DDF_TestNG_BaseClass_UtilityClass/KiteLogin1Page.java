package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//pom class1
public class KiteLogin1Page 
{
	//declaration 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	//private WebElement UN=driver.findElemet(By.xpath("xpath expression"));
	
	@FindBy(xpath="//input[@id='password']")  private WebElement Pwd;
	//private WebElement Pwd=driver.findElemet(By.xpath("xpath expression"));

	@FindBy(xpath="//button[text()='Login ']")	private WebElement loginBtn;
	//private WebElement loginBtn=driver.findElemet(By.xpath("xpath expression"));
	
	
	//initialization
	public KiteLogin1Page(WebDriver driver1)
	{
		PageFactory.initElements(driver1, this);
	}
	
	//usage
	
	//enter username
	public void inpKiteLogin1PageUsername(String username) 
	{
		UN.sendKeys(username);
	}
	
	//enter password
	public void inpKiteLogin1PagePassword(String password)
	{
		Pwd.sendKeys(password);
	}
	
	public void clickKiteLogin1PageLoginBtn()
	{
		loginBtn.click();
	}
	
	
}