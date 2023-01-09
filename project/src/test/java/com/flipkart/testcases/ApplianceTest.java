package com.flipkart.testcases;

import com.flipkart.pages.AppliancesPage;
import com.flipkart.pages.ElectronicsPage;
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

public class ApplianceTest extends basePage {
	@Test(priority = 1)
	public void actest() throws InterruptedException {
		AppliancesPage ap = PageFactory.initElements(driver, AppliancesPage.class);
		test.log(LogStatus.INFO, "User hovers on the Appliance Button");
		test.log(LogStatus.INFO, "User clicks on the SplitAC Button");
		ap.splitAcTest();
		test.log(LogStatus.INFO, "User can see the SplitACs");
		WebElement element = AppliancesPage.split_result;
		String a = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("ac_verify"), a);
	}

}
