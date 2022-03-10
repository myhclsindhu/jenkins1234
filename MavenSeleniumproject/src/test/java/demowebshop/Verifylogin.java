package demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Verifylogin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\New folder\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
		String expectedTitle= "Demo Web Shop. Login";
		String actualTitle= driver.getTitle();

		if(expectedTitle.equals(actualTitle))
		{
		System.out.println(actualTitle);
		System.out.println("Correct Page");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.id("Email")).sendKeys("vinayaka@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("vinayaka");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
		}
		else
		{
		System.out.println("Incorrect Page");
		System.out.println(actualTitle);
		driver.close();
		}
		}
		
	}


