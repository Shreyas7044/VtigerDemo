package UnitTestingTool;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bike {

	@Test(priority=1)
	public void ktm() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ktm.com/en-us.html");
		driver.quit();
	}
	
	
	@Test(invocationCount=2,timeOut=3000)
	public void yamaha() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yamaha-motor.com/");
		driver.quit();
	}
	
	@Test(priority=2,invocationCount=2,threadPoolSize=4)
	public void ather() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.atherenergy.com/");
		driver.quit();
	}
	
	@Test(priority=2,enabled=false)
	public void bmw() {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmwusa.com/");
		driver.quit();
	}
}
