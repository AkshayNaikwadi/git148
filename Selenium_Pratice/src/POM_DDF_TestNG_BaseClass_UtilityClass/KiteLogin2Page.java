
package POM_DDF_TestNG_BaseClass_UtilityClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class 2
public class KiteLogin2Page
{
	
	@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement CntBtn;

	public KiteLogin2Page(WebDriver driver1) 
	{
		PageFactory.initElements(driver1, this);
	}

	public void inpKiteLogin2PagePin(String PINInfo) 
	{
		Pin.sendKeys(PINInfo);
	}

	
	

	public void clickKiteLogin2PageCntBtn() 
	{
		CntBtn.click();
		
	}

}