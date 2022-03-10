package programsdemo;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jVerifylogin {

	@Test
	public void checklogin()
	{
		Logger log = Logger.getLogger(Log4jVerifylogin.class);
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
		log.info("Launch browser");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://demowebshop.tricentis.com/login/");
	    log.info("Application opened");
	    
	    driver.manage().window().maximize();
	    
	    String expectedtitle="Demo web shop. Login";
	    
	    String actualtitle=driver.getTitle();
	    
	    log.info("Title is: "+actualtitle);
	    
	    if(expectedtitle.equals(actualtitle))
	    {	
	        System.out.println(actualtitle);
	        System.out.println("correct Page");
	        driver.findElement(By.id("Email")).sendKeys("vinayaka@gmail.com");
	        driver.findElement(By.name("Password")).sendKeys("vinayaka");
	        driver.findElement(By.xpath("//input[@value='Log in']")).click();
	        log.warn("check if successfully logged in");  
	        driver.findElement(By.linkText("Log out")).click();
	        driver.close();
		}
	
	    else
	    {
	    	
	    	System.out.println("Incorrect Page");
	    	
	    	System.out.println(actualtitle);
	    	
	       	driver.close();
	    }
	    
	}
	
	}

