package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class baseclass {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\amitd\\eclipse-workspace\\E2ETestNGProject\\src\\main\\java\\Resources\\data.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\amitd\\Desktop\\Selenuium Jars\\chromedriver\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}  else if(browserName.equals("firefox")) {
		    //Firefox code
			   
		  }
		  
		  else if(browserName.equals("IE")) {
		    //IE code
		  }
		  
		  else {
		   
		   System.out.println("you should choose any one of above browser");
		  }
		return driver;
		}
	@BeforeMethod

		public void launchbrowser() throws IOException {
			driver=initializeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			
			 
			 
			 
		}
	}

