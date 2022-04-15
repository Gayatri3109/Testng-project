package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.signInPageObjects;
import PageObjectModel.signUpPageObjects;
import Resources.baseclass;

public class VerifySignUp extends baseclass {
	@Test
	public void enterdetails() throws InterruptedException{
		signInPageObjects spo=new signInPageObjects(driver);
		spo.TryForFree().click();
		Thread.sleep(5000);
		
		signUpPageObjects sup=new signUpPageObjects(driver);
		sup.FirstName().sendKeys("Rahul");
		sup.LastName().sendKeys("Ram");
		sup.WorkEmail().sendKeys("abc@gmail.com");
		sup.CompanyName().sendKeys("Cognizant");
		sup.UserPhone().sendKeys("9011092424");
		Select s=new Select(sup.JobTitle());
		s.selectByIndex(1);
		
		Select j=new Select(sup.Country());
		j.selectByIndex(11);
		
		Select k=new Select(sup.Employee());
		k.selectByIndex(1);
	}
	
	
	
	}


