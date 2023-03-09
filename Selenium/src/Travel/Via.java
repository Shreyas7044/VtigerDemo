package Travel;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Via {

	@Test(groups="integration")
	public void launchVia() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		Reporter.log("Via Logged in Successfully", true);
	}
	
	/*@Test
	public void launchgotogate() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gotogate.com/");
		Reporter.log("Combodia Logged in Successfully", true);
		*/
	}



