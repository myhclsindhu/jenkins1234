package testNGprogramsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prioritydemo {
	
	WebDriver driver;
	@Test(description = "Test case to open application")
	public void startapp()
	{
 	   System.out.println("Start application");
 	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver(); 
	   driver.get("http://demowebshop.tricentis.com/login/");
	   driver.manage().window().maximize();
	}
	
	@Test(priority = 1, description ="Test case to verify login functionality")
	public void loginapp()
	{
		System.out.println("Successfull login");
        driver.findElement(By.id("Email")).sendKeys("vinayaka@gmail.com");
	    driver.findElement(By.name("Password")).sendKeys("vinayaka");
	   	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	@Test(priority=2, description ="Test case to verify sign off")
	public void signoff()
	{
		System.out.println("signoff successful");
		boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
        driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	}
	
	
	
	
	
	
	
}
