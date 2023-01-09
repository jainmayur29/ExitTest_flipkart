package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppliancesPage {
	WebDriver driver;

	public AppliancesPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[2]")
	WebElement appliancesbtn_hover;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Split ACs")
	public static WebElement splitAc_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")
	public static WebElement split_result;

	public void splitAcTest() {
		Actions action = new Actions(driver);
		WebElement element = appliancesbtn_hover;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(splitAc_btn));
		WebElement element2 = splitAc_btn;
		action.moveToElement(element2);
		action.click().build().perform();
	}
}
