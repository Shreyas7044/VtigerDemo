package Travel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class agoda {

	@Test(groups="integration",dependsOnGroups = "smoke")
	public void launchagoda() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com");
		Reporter.log("Agoda Logged in Successfully", true);
	}
}
	