package Basic;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToExtractData {

	private static final WebElement RadioButton = null;

	@DataProvider(name = "cred", parallel = false)
	public String[][] sendData() {
		String[][] sarr = { { "male", "shreyas", "bh", "shreyas123@gmail.com", "shreyas@7044", "shreyas@7044" },
				/*{ "female", "deepa", "h", "deepa12@gmail.com", "Deepa145", "Deepa145" },
				{ "male", "kiran", "N", "kiran126@gmail.com", "kiran@123", "kiran@123" },
				{ "female", "sindu", "M", "sindu@158@gmail.com", "sindu@178", "sindu@178" },
				{ "male", "chethan", "d", "chethan6@gmail.com", "chethan@14", "chethan@14" },
				{ "female", "harshitha", "M", "harshitha888@gmail.com", "harshitha@12", "harshitha@12" },
				{ "male", "ganesh", "a", "ganesh12@gmail.com", "ganesh@16", "ganesh@16" },
				{ "female", "nisha", "d", "nisha231@gmail.com", "nisha@111", "nisha@111" },
				{ "male", "ravi", "kiran", "ravi144@gmail.com", "ravikiran@14", "ravikiran@14" },
				{ "male", "sagar", "m", "sagar22@gamil.com", "sagar@12", "sagae@12" },*/
				

		};
		return sarr;
	}

	@Test(dataProvider = "cred")
	public void Register(String[] credential) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sf = new SoftAssert();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Bwoser Launched Successfully", true);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Register")).click();
		WebElement radiobutton = driver.findElement(By.id("gender-" + credential[0] + ""));
		radiobutton.click();

		WebElement firstNametextfeild = driver.findElement(By.id("FirstName"));
		firstNametextfeild.clear();
		firstNametextfeild.sendKeys(credential[1]);
		sf.assertEquals(firstNametextfeild.getAttribute("value"), credential[1],
				"firstname text feild should accepts charaters");
		Reporter.log("FirstName text feild entered sucessfully", true);

		WebElement lastNametextFeild = driver.findElement(By.id("LastName"));
		lastNametextFeild.clear();
		lastNametextFeild.sendKeys(credential[2]);
		sf.assertEquals(lastNametextFeild.getAttribute("value"), credential[2],
				"lastName text feild should accepts charaters");
		Reporter.log("lastName text feild entered sucessfully", true);

		WebElement EmailTextFeild = driver.findElement(By.id("Email"));
		EmailTextFeild.clear();
		EmailTextFeild.sendKeys(credential[3]);
		sf.assertEquals(EmailTextFeild, credential[3], "emailTextFeild should accepts valid data");
		Reporter.log("Email is entered successfully", true);

		WebElement passwordTextfeild = driver.findElement(By.id("Password"));
		passwordTextfeild.clear();
		passwordTextfeild.sendKeys(credential[4]);
		sf.assertEquals(passwordTextfeild, credential[4], "Password Text feild should accepts avalid data");
		Reporter.log("Password entered successfully", true);

		WebElement ConfirmPassordtextFeild = driver.findElement(By.id("ConfirmPassword"));
		ConfirmPassordtextFeild.clear();
		ConfirmPassordtextFeild.sendKeys(credential[5]);
		sf.assertEquals(ConfirmPassordtextFeild, credential[5],
				"Confirm Password Text feild should accepts avalid data");
		Reporter.log(" Confirm Password entered successfully", true);

		WebElement RegisterButton = driver.findElement(By.id("register-button"));
		RegisterButton.click();
		Reporter.log(" RegisterButton clicked  successfully", true);
		sf.assertAll();

		driver.quit();
	}

}
