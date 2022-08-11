package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.commons.compress.utils.FileNameUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClass 
{
     //@Author name: Akshay
	//This method is use to get test data from excel
	//need to pass 2 parameters: 1.rowIndex  2. cellIndex
	public static String getTestData(int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException 
	{

		FileInputStream file=new FileInputStream("F:\\testdata.xlsx");
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 String value = sh.getRow(rowIndex).getCell(cellIndex).getStringCellValue();
			return value;
	}
	
	//@Author name: Akshay
		//This method is use to get test data from excel
		//need to pass 2 parameters: 1.Webdriver object  2.TestcaseID
 

	public static void cpatureScreenShot1(WebDriver driver1, int TCID) throws IOException {
		// TODO Auto-generated method stub
		File src = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
        
        File dest=new File("F:\\screenshot\\TestCaseID"+TCID+".jpg");
        
     
       org.openqa.selenium.io.FileHandler.copy(src, dest);
	   
	}         
           
	public static String readDataFromPF(String key) throws IOException 
	{
		Properties obj = new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\ashis\\eclipse-workspace\\Selenium_Pratice\\Akshay.properties");
	   obj.load(file);
	   String value = obj.getProperty(key);
	  return value;
	}
	
	
	
}
