package pagefactoryDemowebshopPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryLoginPOM {
WebDriver driver;
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(name="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginbtn;
	
	public PageFactoryLoginPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendemailname(String EML)
	{
		email.sendKeys(EML);
	}
	public void sendpassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickloginbtn()
	{
		loginbtn.click();
	}
	
	
}
