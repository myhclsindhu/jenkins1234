package testNGprogramsDemo;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifylogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("http://demowebshop.tricentis.com/login/");
	    
	    driver.manage().window().maximize();
	    
	    String expectedtitle="Demo web shop. Login";
	    
	    String actualtitle=driver.getTitle();
	    
	    if(expectedtitle.equals(actualtitle))
	    {	
	        System.out.println(actualtitle);
	        System.out.println("correct Page");
	        driver.findElement(By.id("Email")).sendKeys("vinayaka@gmail.com");
	        driver.findElement(By.name("Password")).sendKeys("vinayaka");
	        driver.findElement(By.xpath("//input[@value='Log in']")).click();
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
