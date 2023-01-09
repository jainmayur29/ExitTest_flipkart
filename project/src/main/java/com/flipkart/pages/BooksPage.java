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

public class BooksPage {
	WebDriver driver;

	public BooksPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[7]")
	WebElement Booksbtn_hover;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Literature & Fiction")
	public static WebElement Literaturebook_btn;
	
	@FindBy(how = How.XPATH,using="/html/body/div/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div[1]/h2")
	public static WebElement book_result;

	public void book() {
		Actions action = new Actions(driver);
		WebElement element = Booksbtn_hover;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Literaturebook_btn));
		WebElement element2 = Literaturebook_btn;
		action.moveToElement(element2);
		action.click().build().perform();
	}

}
