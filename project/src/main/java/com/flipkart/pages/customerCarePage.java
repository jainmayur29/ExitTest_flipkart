package com.flipkart.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customerCarePage {
	WebDriver driver;

	public customerCarePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[5]/div/div/div/div")
	WebElement more_btn;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "24x7 Customer Care")
	WebElement cc_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[1]/div/div[6]/div[1]")
	WebElement custcare_Orderbtn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/p")
	WebElement custcare_OrderProb;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[1]/div/div[7]/div")
	WebElement custcare_Returnbtn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/p")
	WebElement custcare_ReturnProb;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[1]/div/div[9]/div[1]")
	WebElement custcare_Shoppingbtn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/p")
	WebElement custcare_ShoppingProb;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div[3]/div/div/div[1]/h1")
	public static WebElement cust_result;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/span")
	public static WebElement order_result;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/span")
	public static WebElement return_result;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[3]/div/span")
	public static WebElement shopping_result;

	public void customer() {
		Actions action = new Actions(driver);
		WebElement element = more_btn;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(cc_btn));
		WebElement element2 = cc_btn;
		action.moveToElement(element2);
		action.click().build().perform();
	}

	public void order() {
		custcare_Orderbtn.click();
		custcare_OrderProb.click();
	}

	public void Return() {
		custcare_Returnbtn.click();
		custcare_ReturnProb.click();
	}

	public void shopping() {
		custcare_Shoppingbtn.click();
		custcare_ShoppingProb.click();
	}

}
