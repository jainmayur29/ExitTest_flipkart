package com.flipkart.testcases;

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
import com.flipkart.pages.Login_Page;
import com.flipkart.pages.basePage;
import com.flipkart.utilities.*;
import com.lib.ReadingTestData;

public class loginPageTest extends basePage {
	@Test(description="First Test Case",enabled=true)
	public void loginfunction() {

		Login_Page lp = PageFactory.initElements(driver, Login_Page.class);
		String a = driver.getTitle();
		test.log(LogStatus.INFO, "User entering the mobile number");
		test.log(LogStatus.INFO, "User Click on the request otp button");
		test.log(LogStatus.INFO, "User Click on the cross button");
		lp.login_flipkart(ReadingPropertiesFile.getProperty("mobile_number"));
		Assert.assertEquals(ReadingTestData.getProperty("login_verify"), a);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
}
