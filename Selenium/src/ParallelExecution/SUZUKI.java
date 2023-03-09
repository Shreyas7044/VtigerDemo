package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SUZUKI extends BaseClass{
	
	
	@Test
	public void launch() {
		driver.get("https://www.suzukimotorcycle.co.in/");
		Reporter.log("Browser Launched Successfully",true);
	}

}
