package com.flipkart.testcases;

import com.flipkart.pages.AppliancesPage;
import com.flipkart.pages.BooksPage;
import com.flipkart.pages.ElectronicsPage;
import com.flipkart.pages.FurniturePage;
import com.flipkart.pages.KidsToysPage;
import com.flipkart.pages.MenClothingPage;
import com.flipkart.pages.SportsPage;
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

public class SportsTest extends basePage {
	@Test
	public void crickettest() {
		SportsPage sp = PageFactory.initElements(driver, SportsPage.class);
		test.log(LogStatus.INFO, "User hovers on the Sports Button");
		test.log(LogStatus.INFO, "User clicks on the Cricket Button");
		sp.sports();
		test.log(LogStatus.INFO, "User can see the Circket related Equipments");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(SportsPage.circket_btn));
		WebElement element = SportsPage.Sports_result;
		String a = element.getText();
		//String a = driver.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")).getText();
		Assert.assertEquals(ReadingTestData.getProperty("sports_verify"), a);
	}
}
