package org.automation.flipkart;

import java.time.Duration;

import org.automation.AutomationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartPage extends AutomationPage{
	WebDriver driver;
	private String flipkartUrl="https://www.flipkart.com/";

	public FlipkartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void open() {
		// TODO Auto-generated method stub
		openUrl(flipkartUrl);
		
	}
	
	public String searchForIphoneandVerify() {
		searchPhone();
		return getNumberOfResults();
	}
	
	public String clickAndVerifyProduct() {
		clickFirst();
		return productTitle();
	}

}
