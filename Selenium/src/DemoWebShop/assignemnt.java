package DemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");

		/* Click on Login */
		driver.findElement(By.linkText("Log in")).click();

		/* Email Text Field */
		WebElement emailTextFeild = driver.findElement(By.id("Email"));
		emailTextFeild.clear();
		emailTextFeild.sendKeys("shashishreyas12@gmail.com");
		System.out.println(emailTextFeild.getText());

		/* Password Text Field */
		WebElement passwordTextFeild = driver.findElement(By.id("Password"));
		passwordTextFeild.clear();
		passwordTextFeild.sendKeys("shreyas@7044");
		System.out.println(passwordTextFeild.getText());

		/* Click on login button */
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

		Actions action = new Actions(driver);
		WebElement compu = driver.findElement(By.linkText("Computers"));
		action.click(compu).perform();

		WebElement Accessories = driver.findElement(By.partialLinkText("Accessories"));
		action.moveToElement(Accessories).click().perform();

		WebElement AddToCart = driver.findElement(By.xpath("//a[contains(text(),'TCP Public MT/AT')]"));
		AddToCart.click();

		WebElement Shoppingcart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		Shoppingcart.click();

		WebElement checkbox = driver.findElement(By.id("termsofservice"));
		checkbox.click();

		driver.findElement(By.id("checkout")).click();

		WebElement company = driver.findElement(By.id("BillingNewAddress_Company"));
		company.sendKeys("Test Yantra");

		WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"))
				.findElement(By.xpath("//option[text()='India']"));
		country.click();

		WebElement Address = driver.findElement(By.id("BillingNewAddress_City"));
		Address.sendKeys("Bengaluru");

		WebElement zipcode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
		zipcode.sendKeys("560040");

		WebElement phonenumber = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
		phonenumber.sendKeys("8553150104");

		WebElement continue1 = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
		continue1.click();

		WebElement group = driver.findElement(By.id("shippingoption_0"));
		group.click();

		WebElement cash = driver.findElement(By.id("paymentmethod_0"));
		cash.click();

		WebElement continue2 = driver.findElement(By.id("//input[@onclick='PaymentMethod.save()']"));
		continue2.click();

		WebElement confirmpayment = driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
		confirmpayment.click();

		WebElement orderid = driver.findElement(By.xpath("//ul[@class='details']"));
		System.out.println(orderid.getText());

	}

}
