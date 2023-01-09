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

public class ElectronicsPage {

	WebDriver driver;

	public ElectronicsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[2]/div/div/span[1]")
	public static WebElement electronicsbtn_hover;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Pendrives")
	WebElement pendrive_btn;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Power Banks")
	public static WebElement powerbank_btn;

	@FindBy(how = How.XPATH, using ="/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")
	public static WebElement pendrive_result;

	@FindBy(how = How.XPATH, using ="/html/body/div/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")
	public static WebElement powerbank_result;

	public void pendriveTest() {
		Actions action = new Actions(driver);
		WebElement element = electronicsbtn_hover;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(pendrive_btn));
		WebElement element2 = pendrive_btn;
		action.moveToElement(element2);
		action.click().build().perform();
	}

	public void powerbankTest() {
		Actions action = new Actions(driver);
		WebElement element = electronicsbtn_hover;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(powerbank_btn));
		WebElement element2 = powerbank_btn;
		action.moveToElement(element2);
		action.click().build().perform();

	}

}
