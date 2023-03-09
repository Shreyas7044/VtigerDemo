package Travel;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToActitime {

	@DataProvider(name="cred",parallel=true)
	public String[][] sendData(){
		String[][] sarr = {
				{"admin","managaer"},
				{"trainee","trainee"},
				{"shreyas","shreyas@123"}
		};
		
		return sarr;
		
		}
	
	@Test(dataProvider = "cred")
	public void login(String[] credentials) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		driver.quit();
		}
}
