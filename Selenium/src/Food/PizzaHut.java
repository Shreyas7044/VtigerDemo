package Food;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PizzaHut {

	@Test
	public void launchPizzaHut() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.pizzahut.co.in");
		Reporter.log("PizzaHut Logged in Successfully", true);
	}

}

