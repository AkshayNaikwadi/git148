package Page_Object_Module;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class3
public class KiteHomePage
{	
	@FindBy(xpath="//span[@class='user-id']") private WebElement ProfileName;
	
	public KiteHomePage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
			
	}
	
	
	public void verifyProfileName() {
		String expUserID="DV1510";
		String actUserID = ProfileName.getText();
		
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