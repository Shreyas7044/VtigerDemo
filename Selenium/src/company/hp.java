package company;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

public class hp {
 
	@org.testng.annotations.Parameters("browsername")
	@Test(groups="crm")
	public void launchhp() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hp.com");
		Reporter.log("hp Logged in Successfully", true);
	}

}
