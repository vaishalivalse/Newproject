package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.SignupPageObjects;
import Resources.BaseClass;

public class VerifySignup extends BaseClass {
	
	@Test
	
	public void signup() throws IOException, InterruptedException
	{
	driverInitialize();
	
    driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
    
    driver.manage().window().maximize();
    
    Thread.sleep(2000);
    
   SignupPageObjects spo=new SignupPageObjects(driver);
   
   spo.enterFname().sendKeys("satvik");
   
    spo.enterLname().sendKeys("valse");
    
    spo.enterEmail().sendKeys("satvikvalse123@gmail.com");
    
    WebElement j=spo.selectJobTitle();
    
    Select s=new Select(j);
    
    //s.selectByIndex(2);
    
   // s.selectByVisibleText("IT Manager");
    
    s.selectByValue("Sales_Manager_ANZ");
    
}
}