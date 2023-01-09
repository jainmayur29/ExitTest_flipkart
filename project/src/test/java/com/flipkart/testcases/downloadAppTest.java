package com.flipkart.testcases;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.flipkart.pages.basePage;
import com.flipkart.pages.customerCarePage;
import com.flipkart.pages.downloadAppPage;

import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
import com.flipkart.pages.basePage;
import com.flipkart.pages.customerCarePage;

public class downloadAppTest extends basePage {
	@Test
	public void downloadApptest() throws InterruptedException {
		downloadAppPage dap = PageFactory.initElements(driver, downloadAppPage.class);
		test.log(LogStatus.INFO, "User hovers on More button of the Home Page");
		test.log(LogStatus.INFO, "User clicks on the download App button");
		test.log(LogStatus.INFO, "User clicks on the Google Play store button");
		test.log(LogStatus.INFO,
				"After clicking on Google Play Store It Takes user to the different tab where user can see the download option");
		dap.download();
		String s = driver.findElement(downloadAppPage.FlipkartApp).getText();
		Assert.assertEquals(ReadingTestData.getProperty("verify_download"), s);
	}
}
