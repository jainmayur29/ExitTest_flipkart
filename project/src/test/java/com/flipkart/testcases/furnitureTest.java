package com.flipkart.testcases;

import java.time.Duration;
import com.lib.ReadingTestData;
import com.relevantcodes.extentreports.LogStatus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.flipkart.pages.AppliancesPage;
import com.flipkart.pages.FurniturePage;
import com.flipkart.pages.KidsToysPage;
import com.flipkart.pages.basePage;

public class furnitureTest extends basePage {

	@Test
	public void sofatest() throws InterruptedException {
		FurniturePage fp = PageFactory.initElements(driver, FurniturePage.class);
		test.log(LogStatus.INFO, "User hovers on the Furniture Button");
		test.log(LogStatus.INFO, "User clicks on the Sofa Button");
		fp.sofa();
		test.log(LogStatus.INFO, "User can see the Sofas");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(FurniturePage.sofa_btn));
		WebElement element = FurniturePage.sofa_result;
		String a = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("furniture_verify"), a);
	}
}
