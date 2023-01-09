package com.flipkart.testcases;

import com.flipkart.pages.basePage;
import com.flipkart.pages.customerCarePage;
import com.flipkart.pages.giftCardPage;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
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
import com.flipkart.pages.searchPage;
import com.flipkart.pages.sellerPage;
import com.flipkart.utilities.*;
import com.lib.ReadingTestData;
import com.flipkart.pages.basePage;

public class becomeSellerTest extends basePage {

	@Test(priority = 1)
	public void verifyLocalShippingFees() {
		sellerPage sp = PageFactory.initElements(driver, sellerPage.class);
		test.log(LogStatus.INFO, "User clicks on Become a Seller Button on the home Page");
		test.log(LogStatus.INFO, "User clicks on the Fee Structure");
		sp.sell();
		test.log(LogStatus.INFO, "User can see the local Charges");
		String s = driver.findElement(sellerPage.localCharge1).getText();
		Assert.assertEquals(ReadingTestData.getProperty("local_charge"), s);
	}

	@Test(priority = 2)
	public void verifyZonalShippingFees() {
		test.log(LogStatus.INFO, "User can see the Zonal Charges");
		String m = driver.findElement(sellerPage.ZonalCharge1).getText();
		Assert.assertEquals(ReadingTestData.getProperty("zonal_charge"), m);
	}

	@Test(priority = 3)
	public void verifyNationalShippingFees() {
		test.log(LogStatus.INFO, "User can see the National Charges");
		String n = driver.findElement(sellerPage.NationalCharge1).getText();
		Assert.assertEquals(ReadingTestData.getProperty("national_charge"), n);
		driver.navigate().back();
		driver.navigate().back();
		test.log(LogStatus.INFO, "User navigates back to the Home Page");
	}
}
