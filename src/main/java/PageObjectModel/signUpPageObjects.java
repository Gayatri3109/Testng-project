package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {
	public WebDriver driver;
	
	private By FirstName=By.xpath("//input[@name='UserFirstName']");
	private By LastName=By.xpath("//input[@name='UserLastName']");
	private By  WorkEmail=By.xpath("//input[@name='UserEmail']");
	private By JobTitle=By.name("UserTitle");
	private By CompanyName=By.xpath("//input[@name='CompanyName']");
	private By UserPhone=By.xpath("//input[@name='UserPhone'] ");
	private By Country=By.name("CompanyCountry");
	private By Employee=By.name("CompanyEmployees");
	
		public signUpPageObjects(WebDriver driver2) {
		this.driver=driver2;
	}

		
		
		public WebElement FirstName() {
			return driver.findElement(FirstName);
		}
		public WebElement LastName() {
		return driver.findElement(LastName);
		}
		
	public WebElement WorkEmail() {
			return driver.findElement(WorkEmail);
		  }
	public WebElement JobTitle() {
		return driver.findElement(JobTitle);
	}
	public WebElement CompanyName() {
		return driver.findElement(CompanyName);
}
	public WebElement UserPhone() {
		return driver.findElement(UserPhone);
	}
	public WebElement Country() {
		return driver.findElement(Country);
	}
	public WebElement Employee() {
		return driver.findElement(Employee);
	}
}
