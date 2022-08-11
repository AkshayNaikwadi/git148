
package POM_With_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//POM class 2
public class KiteLogin2Page
{
	
	@FindBy(xpath="//input[@id='pin']") private WebElement Pin;
	@FindBy(xpath="//button[text()='Continue ']") private WebElement CntBtn;

	public KiteLogin2Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void inpKiteLogin2PagePin(String PINInfo) {
		Pin.sendKeys(PINInfo);
	}

	
	public void clickKiteLogin2PageCntBtn() {
		CntBtn.click();
	}

}