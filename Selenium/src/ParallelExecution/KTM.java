package ParallelExecution;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KTM extends BaseClass{
	
	
	@Test
	public void launch() {
		driver.get("https://www.ktm.com/");
		Reporter.log("Browser Launched Successfully",true);
	}

}
