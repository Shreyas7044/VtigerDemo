package company;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testYanta {

	@Test(groups="travel")
	public void launchtestyantra() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testyantra.com");
		Reporter.log("testyantra Logged in Successfully", true);
	}

}
