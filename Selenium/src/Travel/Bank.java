package Travel;

import org.testng.annotations.Test;

public class Bank {

	@Test
	public void CreateAccount() {
		System.out.println("Account Created Successfully");
	}
	
	@Test(dependsOnMethods = "CreateAccount")
	public void EditAccount() {
		System.out.println("Account can be edited");
	}
	
	@Test(dependsOnMethods = {"CreateAccount","EditAccount"})
	public void DeleteAccount() {
		System.out.println("Account Deleted Successfully");
	}
}
