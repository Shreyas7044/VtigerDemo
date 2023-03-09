package company;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class wipro {

	@Test(groups="bank")
	public void launchwipro() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wipro.com/");
		Reporter.log("wipro Logged in Successfully", true);
	}

}
