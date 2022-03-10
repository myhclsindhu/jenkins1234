package pagefactoryDemowebshopTESTS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pagefactoryDemowebshopPOM.PageFactoryLoginPOM;

public class VerifyLoginTest {
	
	
    @Test
    public void validatelogin()
    {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/login/");
    driver.manage().window().maximize();
    
    PageFactoryLoginPOM loginpage=PageFactory.initElements(driver, PageFactoryLoginPOM.class);
    loginpage.sendemailname("vinayaka@gmail.com");
    loginpage.sendpassword("vinayaka");
    loginpage.clickloginbtn();
    
    }
    
    
    
    
    
}
