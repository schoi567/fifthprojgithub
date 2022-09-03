package wdTestNG;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class BaseClass {
	WebDriver driver; 
	
	@BeforeMethod 
	public void SetUp() {
		driver = new ChromeDriver(); 
		driver.get("http://34.227.17.22:8084/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
		
	} 
	
	
	@AfterMethod 
	public void TearDown() {
		driver.close(); 
		
		
	} 
	 
		
	} 
	
	
	
	
	
 








