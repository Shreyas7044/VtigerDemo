package Travel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kayak {

	@Test(groups="smoke")
	public void launchKayak() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kayak.co.in");
		Reporter.log("kayak Logged in Successfully", true);
	}

}
