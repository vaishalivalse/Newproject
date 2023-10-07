package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.BaseClass;

public class Verifylogin extends BaseClass{

	
	@Test
  public void login() throws IOException, InterruptedException
 {
  driverInitialize();
  
  Thread.sleep(1000);
  
  driver.get("https://login.salesforce.com/?locale=in");
  
  Thread.sleep(1000);
  
  WebElement UN=driver.findElement(By.xpath("//input[@id='username']"));
  
  UN.sendKeys("vaishu123@gmail.com");
  
  WebElement PWD=driver.findElement(By.xpath("//input[@id='password']"));
  
  PWD.sendKeys("vaishu#123");
  
  WebElement loginButton=driver.findElement(By.xpath("//input[@id='Login']"));
  
  loginButton.click();
 }
  
  }
