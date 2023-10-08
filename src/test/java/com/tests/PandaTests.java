package com.tests;

import org.automation.BaseTests;
import org.automation.automationPanda.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PandaTests extends BaseTests {
	HomePage homePage;

	@Test
	public void validateLogin() {
		homePage=new HomePage(driver);
		homePage.open();
		Assert.assertEquals(homePage.contactPresent(), "Contact | Automation Panda");
	}
	@Test
	public void verifysentMeesage() {
		homePage=new HomePage(driver);
		homePage.details();
		Assert.assertEquals(homePage.verifyMsg(), "Your message has been sent");
	}
}
