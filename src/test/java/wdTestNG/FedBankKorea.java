package wdTestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import junit.framework.Assert;
import pages.LoginPage;

public class FedBankKorea extends BaseClass{

	@Test
	public void NegativeTest() {
		String ExpMessage = "Invalid Username or Password";
		LoginPage login = new LoginPage(driver); 
		login.loginFunction("vaet","vwer" ); 
		
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		 alert.accept();	
		 
		 
		 
	 
	}
	
	
	
	@Test
	public void PositiveTest() {
		String ExpMessage = "You have successfully logged in.";
		LoginPage login = new LoginPage(driver); 
		login.loginFunction("Test","Test" ); 
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
		 alert.accept();
		 Assert.assertEquals(alertMessage, ExpMessage); 
		 
		 
		 
	}
		
		
	} 
	
	
	
	
	
 








