package TestCases;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resources.BaseClass;

public class VerifyLogin2 extends BaseClass{
	
	@Test
	
	public void login () throws IOException, InterruptedException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\SUMIT\\Desktop\\Book1.xlsx\\");
		
		XSSFWorkbook workbook=new XSSFWorkbook(fs);
		
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell1=row.getCell(0);
		
		String c1=cell1.toString();
		
		XSSFCell cell2=row.getCell(1);
		
		String c2=cell2.toString();
		
		//System.out.println(sheet.getRow(0).getCell(0));
		
		//System.out.println(sheet.getRow(0).getCell(1));	
		
       driverInitialize();
	  
	   Thread.sleep(2000);
	
	   driver.get("https://login.salesforce.com/?locale=in");
	
	   driver.manage().window().maximize();
	
	   LoginPageObjects lpo=new LoginPageObjects(driver);
	
	   lpo.enterusername().sendKeys(c1);
	
	   Thread.sleep(2000);
	
	  lpo.enterpassword().sendKeys(c2);
	
	  lpo.enterclickonlogin().click();
	  
	//  Assert.assertEquals(actual, expected);
	

	}
}