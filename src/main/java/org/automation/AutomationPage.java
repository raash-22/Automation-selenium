package org.automation;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationPage {
	protected WebDriver webDriver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id=\"menu-item-10\"]/a")
	WebElement contact;
	
	@FindBy(xpath = "//*[@id=\"g3-name\"]")
	WebElement name;
	@FindBy(xpath = "//*[@id=\"g3-email\"]")
	WebElement email;
	@FindBy(xpath = "//*[@id=\"contact-form-comment-g3-message\"]")
	WebElement message;
	@FindBy(xpath = "//*[@id=\"contact-form-3\"]/form/div/div[4]/button")
	WebElement contactme;
	@FindBy(xpath = "//*[@id=\"contact-form-success-header\"]")
	WebElement successMsg;
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input")
	WebElement textBox;
	
	@FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/span")
	WebElement searchResult;
	@FindBy(xpath="//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]")
	WebElement firstResult;
	@FindBy(xpath="//span[@class='B_NuCI']")
	WebElement firstResultTitle;
	public AutomationPage(WebDriver webDriver) {
		this.webDriver=webDriver;
		PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(webDriver,Duration.ofSeconds(30));
	}
	
	protected void openUrl(String url) {
		webDriver.get(url);
	}
	
	protected String checkContact() {
		contact.isDisplayed();
		contact.click();
		return webDriver.getTitle();
	}
	
	protected void enterDetails() {
		System.out.println(name.isDisplayed());
		name.sendKeys("raash");
		System.out.println(email.isDisplayed());
		email.sendKeys("123@gmail.com");
		System.out.println(email.isDisplayed());
		message.sendKeys("good");
	}
	
	protected void clickSubmit() {
		System.out.println(contactme.isDisplayed());
		contactme.click();
	}
	
	protected String getMsg() {
		return successMsg.getText();
	}
	
	protected void searchPhone() {
		textBox.sendKeys("iphone14");
		textBox.sendKeys(Keys.ENTER);
	}
	protected String getNumberOfResults() {
		return searchResult.getText();
	}
	
	protected void clickFirst() {
		firstResult.click();
	}
	protected String productTitle() {
		return webDriver.getTitle();
	}

}
