package Travel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TripAdvisor {

	@Test(groups="smoke")
	public void launchTripAdvisor() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tripadvisor.in");
		Reporter.log("tripadvisor Logged in Successfully", true);
	}
}

