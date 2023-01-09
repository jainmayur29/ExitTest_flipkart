package com.flipkart.testcases;

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
import com.flipkart.pages.*;
import com.flipkart.utilities.*;
import com.lib.ReadingTestData;

public class CoinBalanceTest extends basePage {
	@Test
	public void checkSuperCoinBalance() throws InterruptedException {
		ExplorePlusPage epp = PageFactory.initElements(driver, ExplorePlusPage.class);
		test.log(LogStatus.INFO, "User clicks on the  Explore button of the Home Page");
		test.log(LogStatus.INFO, "User clicks on the  Coin Balance Button");
		epp.coin();
		test.log(LogStatus.INFO, "User can see the Super Coin Balance");
		WebElement element = ExplorePlusPage.coin_result;
		String s = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("coin_verify"), s);
	}
}
