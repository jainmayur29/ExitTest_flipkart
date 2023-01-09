package com.flipkart.testcases;

import com.flipkart.pages.basePage;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import com.relevantcodes.extentreports.LogStatus;
import com.flipkart.pages.basePage;
import com.flipkart.pages.ElectronicsPage;
import com.flipkart.pages.searchPage;
import com.flipkart.utilities.*;
import com.lib.ReadingTestData;

public class productSearchTest extends basePage {

	@Test
	public void productSearch() throws InterruptedException {
		searchPage sp = PageFactory.initElements(driver, searchPage.class);
		test.log(LogStatus.INFO, "User search for the desire product in the search bar");
		test.log(LogStatus.INFO, "User clicks on the search button");
		sp.productSearch(ReadingPropertiesFile.getProperty("product_search"));
		test.log(LogStatus.INFO, "User can see the product that was searched");
		WebElement element = searchPage.search_result;
		String s = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("product_verify"), s);
		Thread.sleep(2000);
	}
}
