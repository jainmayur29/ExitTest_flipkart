package com.flipkart.pages;

import org.openqa.selenium.By;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class downloadAppPage {
	WebDriver driver;

	public downloadAppPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div/div/div/div")
	WebElement more_btn;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Download App")
	WebElement downloadApp_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[3]/div[2]/a/img")
	WebElement playstore_btn;

	public static By FlipkartApp = By
			.xpath("/html/body/c-wiz[2]/div/div/div[1]/div[1]/div/div/c-wiz/div[2]/div[1]/div/h1/span");

	public void download() {
		Actions action = new Actions(driver);
		WebElement element = more_btn;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(downloadApp_btn));
		WebElement element2 = downloadApp_btn;
		action.moveToElement(element2);
		action.click().build().perform();
		playstore_btn.click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
	}

}
