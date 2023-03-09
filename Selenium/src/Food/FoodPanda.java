package Food;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FoodPanda {

	@Test
	public void launchFoodPanda() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foodpanda.com");
		Reporter.log("FoodPanda Logged in Successfully", true);
	}

}
