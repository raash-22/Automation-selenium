package org.automation.automationPanda;

import org.automation.AutomationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AutomationPage {
	private String automationPandaUrl="https://automationpanda.com/2021/12/29/want-to-practice-test-automation-try-these-demo-sites/";

	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void open() {
		// TODO Auto-generated method stub
		openUrl(automationPandaUrl);
		
	}
	public String contactPresent() {
		return checkContact();
	}
	
	public void details() {
		enterDetails();
		clickSubmit();
	}
	public String verifyMsg() {
		return getMsg();

	}

}
