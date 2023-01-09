package com.flipkart.testcases;

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

public class custCareTest extends basePage {

	@Test(priority = 1)
	public void customerCareTest() throws InterruptedException {
		customerCarePage ccp = PageFactory.initElements(driver, customerCarePage.class);
		test.log(LogStatus.INFO, "User hovers on the More Button of the Home Page");
		test.log(LogStatus.INFO, "User clicks on the 24x7 Customer Care Button");
		ccp.customer();
		test.log(LogStatus.INFO, "User can see the 24x7 Customer Support");
		WebElement element = customerCarePage.cust_result;
		String a = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("cc_verify"), a);
	}

	@Test(priority = 2)
	public void custcare_order() throws InterruptedException {
		customerCarePage ccp = PageFactory.initElements(driver, customerCarePage.class);
		test.log(LogStatus.INFO, "User clicks on the order Button of the Customer Support Page");
		ccp.order();
		test.log(LogStatus.INFO, "Users can see all the questions related to Order");
		WebElement element = customerCarePage.order_result;
		String s = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("cc_orderVerify"), s);
	}

	@Test(priority = 3)
	public void custcare_return() throws InterruptedException {
		customerCarePage ccp = PageFactory.initElements(driver, customerCarePage.class);
		test.log(LogStatus.INFO, "User clicks on the Return Button of the Customer Support Page");
		ccp.Return();
		test.log(LogStatus.INFO, "Users can see all the questions related to Return");
		WebElement element = customerCarePage.return_result;
		String s = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("cc_returnVerify"), s);
	}

	@Test(priority = 4)
	public void custcare_shopping() throws InterruptedException {
		customerCarePage ccp = PageFactory.initElements(driver, customerCarePage.class);
		test.log(LogStatus.INFO, "User clicks on the Shopping Button of the Customer Support Page");
		ccp.shopping();
		test.log(LogStatus.INFO, "Users can see all the questions related to Shopping");
		WebElement element = customerCarePage.shopping_result;
		String s = element.getText();
		Assert.assertEquals(ReadingTestData.getProperty("cc_shoppingVerify"), s);
	}
}
