package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class1
public class KiteLogin1Page 
{
	//declaration 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	//private WebElement UN=driver.findElemet(By.xpath("xpath expression"));
	
	@FindBy(xpath="//input[@id='password']")  private WebElement Pwd;
	//private WebElement Pwd=driver.findElemet(By.xpath("xpath expression"));

	@FindBy(xpath="//button[text()='Login ']")	private WebElement loginBtn;
	//private WebElement loginBtn=driver.findElemet(By.xpath("xpath expression"));
	
	
	//Initialization
	public KiteLogin1Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage
	
	

	public void inpKiteLogin1PagePassword(String Password ) {
	
		Pwd.sendKeys(Password);
	}

	public void clickKiteLogin1PageLoginBtn() {
		
		loginBtn.click();
		
		}

	public void inpKiteLogin1PageUsername(String username) 
	{
		UN.sendKeys(username);
		
	}

	public void enterPWD() {
		// TODO Auto-generated method stub
		
	}

	public void clickOnLoginBtn() {
		// TODO Auto-generated method stub
		
	}

	
	
}