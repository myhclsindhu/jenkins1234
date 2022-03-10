package programsdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesingDemo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinayaka.n\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
	    File credentials=new File("C:\\Users\\vinayaka.n\\Downloads\\New folder\\testdata.xlsx");
	    
	    FileInputStream fis=new FileInputStream(credentials);
	    
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    
	    XSSFSheet sheet1=wb.getSheetAt(0);
	    
	    int rowcount=sheet1.getLastRowNum();
	    
	    for(int i=0;i<=rowcount;i++)
	    {
	    	String email=sheet1.getRow(i).getCell(0).getStringCellValue();
	        String password=sheet1.getRow(i).getCell(1).getStringCellValue();
	        driver.get("http://demowebshop.tricentis.com/login/");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("Email")).sendKeys(email);
		    driver.findElement(By.name("Password")).sendKeys(password);
		    driver.findElement(By.xpath("//input[@value='Log in']")).click();
		    driver.findElement(By.linkText("Log out")).click();
	    	
	    }
	      driver.close();
	}

}
