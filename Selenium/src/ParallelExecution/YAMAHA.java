package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class YAMAHA extends BaseClass{
	
	
	@Test
	public void launch() {
		driver.get("https://yamaha-motor.com/");
		Reporter.log("Browser Launched Successfully",true);
	}

}
