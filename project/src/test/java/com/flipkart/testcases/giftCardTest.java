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
import com.flipkart.utilities.*;
import com.lib.ReadingTestData;

public class giftCardTest extends basePage {
	@Test(priority = 1)
	public void GiftCardTest() throws InterruptedException {
		giftCardPage gcp = PageFactory.initElements(driver, giftCardPage.class);
		test.log(LogStatus.INFO, "User hovers on the Login button of the Home Page");
		test.log(LogStatus.INFO, "User clicks on the GiftCard button");
		test.log(LogStatus.INFO, "User clicks on the Flipkart Wallet button");
		gcp.gift();
		test.log(LogStatus.INFO, "User can see the GiftCard Section");
		WebElement element = giftCardPage.gift_result;
		String s = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("giftcard_verify"), s);
	}

	@Test(priority = 2)
	public void buyFlipkartGiftCardTest() throws InterruptedException {
		giftCardPage gcp = PageFactory.initElements(driver, giftCardPage.class);
		test.log(LogStatus.INFO, "User enters the Reciever email Address");
		test.log(LogStatus.INFO, "User enters the Reciever Name");
		test.log(LogStatus.INFO, "User Selects the Value of the Card from the drop down menu");
		test.log(LogStatus.INFO, "User enters the number of Cards that he wants to buy");
		test.log(LogStatus.INFO, "User enters the Gifter Name");
		test.log(LogStatus.INFO, "User enters the Message");
		gcp.buygiftcard(ReadingPropertiesFile.getProperty("reciever_email"),
				ReadingPropertiesFile.getProperty("reciever_name"), ReadingPropertiesFile.getProperty("no_of_cards"),
				ReadingPropertiesFile.getProperty("gifter_name"), ReadingPropertiesFile.getProperty("message"));
		test.log(LogStatus.INFO, "User can see the buy button and clicks on it");
		boolean s = driver.findElement(giftCardPage.buybtn).isDisplayed();
		Assert.assertEquals(ReadingTestData.getProperty("buy_giftcard_verify"), s);
		Thread.sleep(3000);
	}
}
