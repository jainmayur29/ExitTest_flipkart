package com.flipkart.pages;

import org.openqa.selenium.WebDriver;

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

public class MenClothingPage {

	WebDriver driver;

	public MenClothingPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[3]")
	WebElement menbtn_hover;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Sweatshirts")
	public static WebElement sweatshirt_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")
	public static WebElement sweatshirt_result;

	public void sweatS() {
		Actions action = new Actions(driver);
		WebElement element = menbtn_hover;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(sweatshirt_btn));
		WebElement element2 = sweatshirt_btn;
		action.moveToElement(element2);
		action.click().build().perform();
	}
}
