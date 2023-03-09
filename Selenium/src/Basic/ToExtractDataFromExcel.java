package Basic;
	import java.io.FileInputStream;
	import java.io.IOException;
	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.sl.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	public class ToExtractDataFromExcel {
		@DataProvider 
		public String[][] Data() throws EncryptedDocumentException, IOException  {
			FileInputStream fis  = new FileInputStream("./TestData/DemoData.xlsx");
			Workbook workbook = WorkbookFactory.create(fis);
			org.apache.poi.ss.usermodel.Sheet wb = workbook.getSheet("Sheet1");
			int row = wb.getPhysicalNumberOfRows();
			int cell = wb.getRow(0).getPhysicalNumberOfCells();
			String [] [] value  = new String[row][cell];

			//2D array
			for(int i=1;i<=row; i++) {
				for(int j=0;j<cell;j++) {
					value[i][j] = wb.getRow(i).getCell(j).toString();
					System.out.println( value[i][j]);
				}
			}
			return value;
		}

		@Test(dataProvider = "Data")
		public void reg(String[] credential) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.linkText("Register")).click();
			driver.findElement(By.id("gender-"+credential[0]+"")).click();
			driver.findElement(By.id("FirstName")).sendKeys(credential[1]);
			driver.findElement(By.id("LastName")).sendKeys(credential[2]);
			driver.findElement(By.id("Email")).sendKeys(credential[3]);
			driver.findElement(By.id("Password")).sendKeys(credential[4]);
			driver.findElement(By.id("ConfirmPassword")).sendKeys(credential[5]);
			driver.findElement(By.id("register-button")).click();
			driver.quit();
		}
	}

