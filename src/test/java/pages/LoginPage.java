package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver driver; 
	
	public LoginPage(WebDriver driver) {
		this.driver = driver; 
	}

 
	
	public void loginFunction(String Uname, String Pass) {
	/*(	WebElement LoginLink = driver.findElement(By.linkText("Log in")); 
		LoginLink.click(); */ 
		
		WebElement UserName = driver.findElement(By.id("username-field")); 
		UserName.sendKeys(Uname); 
		
		WebElement Password = driver.findElement(By.id("password-field")); 
		Password.sendKeys(Pass); 
		
 
		
		WebElement LoginBtn = driver.findElement(By.id("login-form-submit")); 
		LoginBtn.click(); 
		
	} 
	
	
	
	
}
