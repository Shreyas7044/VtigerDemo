package LaunchBrowsers;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class DemoWebshop {

		public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.linkText("Register")).click();
			
			FileInputStream fis = new FileInputStream("./TestData/DemoWeb.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			String data = workbook.getSheet("Sheet1").getRow(1).getCell(0).toString();
			 WebElement button = driver.findElement(By.name("Gender"));
			 button.sendKeys(data);
			 button.click();
			String testData = workbook.getSheet("Sheet1").getRow(1).getCell(1).toString();
			driver.findElement(By.id("FirstName")).sendKeys(testData);
			String testdata1 = workbook.getSheet("Sheet1").getRow(1).getCell(2).toString();
			driver.findElement(By.id("LastName")).sendKeys(testdata1);
			String testdata2 = workbook.getSheet("Sheet1").getRow(1).getCell(3).toString();
			driver.findElement(By.id("Email")).sendKeys(testdata2);
			String testData3 = workbook.getSheet("Sheet1").getRow(1).getCell(4).toString();
			driver.findElement(By.id("Password")).sendKeys(testData3);
			String testData4 = workbook.getSheet("Sheet1").getRow(1).getCell(5).toString();
			driver.findElement(By.id("ConfirmPassword")).sendKeys(testData4);
			driver.findElement(By.id("register-button")).click();
				
		}

	}