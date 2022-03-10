package demowebshopTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import demowebshopPOM.LoginPOM;

public class ValidateLogintest {

	@Test
	public void checklogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login/");
	    driver.manage().window().maximize();
		
	    LoginPOM login=new LoginPOM(driver);
	    login.enteremail("vinayaka@gmail.com");
	    login.enterpassword("vinayaka");
	    login.clicklogin();
	    	        
	}  	
	
}	
	
	
	
	
	
