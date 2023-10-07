package Resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	public static WebDriver driver;
	
	public void driverInitialize() throws IOException
	{
      FileInputStream fis=new FileInputStream("C:\\Users\\SUMIT\\eclipse-workspace\\VaishaliMavenProject\\src\\main\\java\\Resources\\data.properties");
          //this will read the properties file
      
      Properties prop=new Properties();    //by this we can use load method
      
      prop.load(fis);
      
      String browserName=prop.getProperty("browser");
      
      if(browserName.equalsIgnoreCase("chrome"))
      {
       driver=new ChromeDriver();
      }  
      
      else if(browserName.equalsIgnoreCase("edge"))
      {
    	driver=new EdgeDriver();
      }
      else if(browserName.equalsIgnoreCase("Firefox"))
      {
         driver=new FirefoxDriver();
      }
      else 
      {
    	  System.out.println("plz make sure you have correct browser");
      }
      
      
      
      
}
}