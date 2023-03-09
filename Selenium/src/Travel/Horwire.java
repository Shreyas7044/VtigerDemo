package Travel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Horwire {

	@Test(groups="integration")
	public void launchHorwire() {

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hotwire.com/");
		Reporter.log("hotwire Logged in Successfully", true);
	}
}
