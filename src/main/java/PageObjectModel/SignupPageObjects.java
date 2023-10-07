package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPageObjects {
	
	public static WebDriver driver;
	
	private By Fname=By.xpath("//input[@name='UserFirstName']");
	
	private By Lname=By.xpath("//input[@name='UserLastName']");
	
	private By Email=By.xpath("//input[@name='UserEmail']");
	
	private By JobTitle=By.xpath("//select[@name='UserTitle']");
	
	public SignupPageObjects(WebDriver driver2) {
		
		this.driver=driver2;
	}

	public WebElement enterFname() {
		
		
	return driver.findElement(Fname);
	}
	
	public WebElement enterLname() {
		
		return driver.findElement(Lname);
	}
	
	public WebElement enterEmail() {
		
		return driver.findElement(Email);
	}
		
		public WebElement selectJobTitle()
		{
			return driver.findElement(JobTitle);
	}

}
