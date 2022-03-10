package testNGprogramsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verifygoogletest {
	WebDriver driver;
	@BeforeMethod
	public void startapp()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
	}
	
	@Test
	public void checktitle()
	{
	 String actualtitle= driver.getTitle();
	 Assert.assertEquals(actualtitle, "google");
	}	
		
	@Test(priority=1)
	public void checklogo()
	{
		boolean view=driver.findElement(By.xpath("//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(view);
	}
	
	
	@AfterMethod
	public void closebrowser()
	{
	driver.close();
	}
		
		

		
	}
	
	
	
	
	
	

