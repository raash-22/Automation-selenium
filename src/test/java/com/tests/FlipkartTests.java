package com.tests;

import org.automation.BaseTests;
import org.automation.flipkart.FlipkartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTests extends BaseTests {
	FlipkartPage page;
	@Test
	public void searchIphone() {
		page=new FlipkartPage(driver);
		page.open();
		String text=page.searchForIphoneandVerify();
		System.out.println(text);
		System.out.println("Number of results : "+text.substring(19, 22));
		String partialText="Showing 1 – 24 of";
		Assert.assertTrue(text.contains(partialText));
	}
	
	@Test
	public void verifyFirstResult() {
		page=new FlipkartPage(driver);
		String productTtitle=page.clickAndVerifyProduct();
		Assert.assertEquals(productTtitle, "Iphone14- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	}
}
