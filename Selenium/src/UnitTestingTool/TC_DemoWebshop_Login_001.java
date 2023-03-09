package UnitTestingTool;

import org.testng.annotations.Test;

/**
 * 
 * @author win10
 *
 */

public class TC_DemoWebshop_Login_001 {  //test class

	@Test(priority=4)
	public void invalidLogin() {     // test case
		System.out.println("Not a Valid User");   // test steps
	}
	
	@Test(priority=3)
	public void ValidLogin() {
		System.out.println(" Hi Welcome to Advance Selenium");
	}
	
	@Test(priority=2)
	public void registerandLogin () {
		System.out.println(" Congratulations....!!! Hi Welcome to Advance Selenium");
	}
	
	@Test(priority=1)
	public void createUser() {
		System.out.println("User is created successfully");
	}
	
	@Test(priority=5)
	public void deleteUser() {
		System.out.println("User is deleted successfully");
	}
	
}
