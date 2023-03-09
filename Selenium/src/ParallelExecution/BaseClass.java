package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;

	@Parameters("browsername")
	@BeforeClass
	public  void browser(String bname) {
		if(bname.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		
		} else if(bname.equalsIgnoreCase("msedge")) {
			System.setProperty("webdriver.edge.driver","./driver/edgedriver.exe");
			driver = new FirefoxDriver(); 
		}
	}
}

	

