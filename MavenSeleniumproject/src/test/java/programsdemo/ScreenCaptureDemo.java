package programsdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScreenCaptureDemo {

	@Test
	public void validatelogin() throws IOException
	{
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver(); 
		   driver.get("http://demowebshop.tricentis.com/login/");
		   driver.manage().window().maximize();
		   
		   driver.findElement(By.id("Email")).sendKeys("vinayaka@gmail.com");
		   driver.findElement(By.name("Password")).sendKeys("vinayaka");
		   driver.findElement(By.xpath("//input[@value='Log in']")).click();
		   
		   boolean view=driver.findElement(By.linkText("Log out")).isDisplayed();
		   Assert.assertTrue(view);
		   
		   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(src, new File("C:\\Users\\vinayaka.n\\Downloads\\New folder\\screen2.png"));
		   
		   driver.findElement(By.linkText("Log out")).click();
		   driver.close(); 	   
		   
	}
}
