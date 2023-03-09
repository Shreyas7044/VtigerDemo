package Food;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Gopizza {

	@Test
	public void launchGopizza() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gopizza.in");
		Reporter.log("Gopizza Logged in Successfully", true);
	}


}
