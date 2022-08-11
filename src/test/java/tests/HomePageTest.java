package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.HomePage;

public class HomePageTest extends BaseTest{
	
	SoftAssert sa;
	HomePage hp;

	@BeforeClass
	public void initObject() {
		
		
		 sa=new SoftAssert();
		hp=new HomePage(driver);
	}
	
	@Test (priority=1)
	public void goToTab() {
		
		
		hp.adminMenu();
		
		
	}
	@Test (priority=2)
	public void logout() {
		
		
		hp.logout();
	}

}


