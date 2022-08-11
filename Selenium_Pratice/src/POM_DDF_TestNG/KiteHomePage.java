package POM_DDF_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class3
public class KiteHomePage
{	
	
	//DECLERATION
	@FindBy(xpath="//span[text()='ZMY641']") private WebElement ProfileName;
	@FindBy(xpath = "//span[text()='AA']") private  WebElement clickAAbtn;
	@FindBy(xpath = "//a[@target='_self']") private  WebElement clicklogoutbtn;
	   
			//Initionalization
	   public KiteHomePage(WebDriver driver1)
	{
			PageFactory.initElements(driver1, this);
	}
	
	   //usage
	//method with return type
	public String getKiteHomePageProfileName()
	{
		String actUserID = ProfileName.getText();
	  return actUserID;
	}

//    public void clickKiteHomePageProfileName() 
//    {
//    	clickAAbtn.click();
//    }


    public void clicklogoutbtn() 
    {
    	clicklogoutbtn.click();
    }

	public void clickAAbtn() {
		// TODO Auto-generated method stub
		clickAAbtn.click();
	}


	
	
}