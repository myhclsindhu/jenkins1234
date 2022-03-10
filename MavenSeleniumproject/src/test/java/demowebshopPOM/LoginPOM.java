package demowebshopPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {
    WebDriver driver;
	By email=By.id("Email");
	By password=By.name("password");
	By signin = By.xpath("//input[@value='Log in']");
	
	public LoginPOM(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enteremail(String EM)
	{
		driver.findElement(email).sendKeys(EM);
	}
	
	public void enterpassword(String PW)
	{
		driver.findElement(password).sendKeys(PW);
	}
	public void clicklogin()
	{
		driver.findElement(signin).click();
	}
	
	
	
	
	
	
	
	
	
	
}
