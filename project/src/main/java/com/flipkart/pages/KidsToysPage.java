package com.flipkart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KidsToysPage {
	WebDriver driver;

	public KidsToysPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[5]")
	WebElement KidsToysbtn_hover;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Educational Toys")
	public static WebElement educationalToy_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")
	public static WebElement Kids_result;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/span")
	public static WebElement Kids_wait;

	public void toy() {
		Actions action = new Actions(driver);
		WebElement element = KidsToysbtn_hover;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(educationalToy_btn));
		WebElement element2 = educationalToy_btn;
		action.moveToElement(element2);
		action.click().build().perform();
	}
}
