package com.flipkart.testcases;

import com.flipkart.pages.AppliancesPage;
import com.flipkart.pages.ElectronicsPage;
import com.flipkart.pages.KidsToysPage;
import com.flipkart.pages.MenClothingPage;
import com.flipkart.pages.WomenClothingPage;
import com.flipkart.pages.basePage;
import com.flipkart.pages.customerCarePage;
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

public class KidsToyTest extends basePage {
	@Test
	public void toytest() throws InterruptedException {
		KidsToysPage ktp = PageFactory.initElements(driver, KidsToysPage.class);
		test.log(LogStatus.INFO, "User hovers on the KidsToy Button");
		test.log(LogStatus.INFO, "User clicks on the Educational Button");
		ktp.toy();
		test.log(LogStatus.INFO, "User can see the Educational Toys");
		Thread.sleep(3000);
		WebElement element = KidsToysPage.Kids_result;
		String a = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("kids_verify"), a);
	}
}
