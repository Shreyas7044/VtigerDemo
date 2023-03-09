package company;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class techmandra {

	@Test(groups="hospital")
	public void launchtechmandra() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.smart-academy.in/");
		Reporter.log("techmandra Logged in Successfully", true);
	}

}


