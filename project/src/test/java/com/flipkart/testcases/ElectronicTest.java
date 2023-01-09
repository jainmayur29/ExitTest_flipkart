package com.flipkart.testcases;

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

public class ElectronicTest extends basePage {

	@Test(priority = 1)
	public void pendriveTest() throws InterruptedException {

		ElectronicsPage ep = PageFactory.initElements(driver, ElectronicsPage.class);
		test.log(LogStatus.INFO, "User hovers on the Electronic Button");
		test.log(LogStatus.INFO, "User clicks on the PenDrive Button");
		ep.pendriveTest();
		test.log(LogStatus.INFO, "User can see the Pendrives");
		WebElement element = ElectronicsPage.pendrive_result;
		String a = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("pendrive_verify"), a);
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
	}

	@Test(priority = 2)
	public void powerbankTest() throws InterruptedException {
		ElectronicsPage ep = PageFactory.initElements(driver, ElectronicsPage.class);
		test.log(LogStatus.INFO, "User hovers on the Electronic Button");
		test.log(LogStatus.INFO, "User clicks on the Power Bank Button");
		ep.powerbankTest();
		test.log(LogStatus.INFO, "User can see the PowerBanks");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ElectronicsPage.powerbank_btn));
		WebElement element = ElectronicsPage.powerbank_result;
		String a = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("powerbank_verify"), a);
	}
}
