package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.security.Password;

public class To_ReadData_from_PropertyFile {

	public static void main(String[] args) throws IOException {
		
		//create of input stream
		FileInputStream  fis =  new  FileInputStream("./TestData/TestData.properties");
		
		//create of file type object
		Properties pro = new Properties();
		
		// Appropriate read methods 
		pro.load(fis);
		String testUrl = (String) pro.get("url");
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(testUrl);
		String un=(String)pro.get("username");
		driver.findElement(By.id("username")).sendKeys(un);
		String psw  = (String) pro.get("password");
		driver.findElement(By.name("pwd")).sendKeys(psw);
		driver.findElement(By.linkText("Login")).click();
		System.out.println(un);
		System.out.println(psw);
	}

}
