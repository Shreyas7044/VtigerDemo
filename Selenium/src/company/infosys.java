package company;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class infosys {

	@Test(groups="erp",dependsOnGroups = "crm")
	public void launchinfosys() {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.infosys.com");
		Reporter.log("infosys Logged in Successfully", true);
	}

}
