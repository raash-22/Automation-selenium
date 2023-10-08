package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTests {
	protected WebDriver driver;
	
	@BeforeSuite
	protected void setup() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\drivers\\msedgedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		driver=new EdgeDriver();
	}
	@AfterSuite
	protected void cleanup() {
		driver.quit();
	}

}
