package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import PageObjectModel.signInPageObjects;
import Resources.baseclass;

public class VerifySignIn extends baseclass{
 
 
 @Test
 public void enterCredientials(){
  
  signInPageObjects spo=new signInPageObjects(driver);
 // driver.findElement(By.xpath("")).sendKeys("jjdj");
  spo.enterUserName().sendKeys("rahul");
  spo.enterPassword().sendKeys("secure123");
  spo.clickOnLogin().click();
 
 
  
  
 }
}
