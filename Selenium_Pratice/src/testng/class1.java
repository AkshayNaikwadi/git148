package testng;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class class1 
{

	
	@Test
    public void TC1() 
{
Reporter.log("message 1",true);
}
	
	@Test
    public void TC2() 
{
   
		Reporter.log("message",true);
	Assert.fail();
}
	
	
	
}

