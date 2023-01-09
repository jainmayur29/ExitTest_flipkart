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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class giftCardPage {
	WebDriver driver;

	public giftCardPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")
	WebElement loginbtn_hover;

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Gift Cards")
	WebElement giftCard_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div[3]/div/a/div/div/img[2]")
	WebElement addToFlipkart_btn;

	public void gift() {
		Actions action = new Actions(driver);
		WebElement element = loginbtn_hover;
		action.moveToElement(element).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(giftCard_btn));
		WebElement element2 = giftCard_btn;
		action.moveToElement(element2);
		action.click().build().perform();
		addToFlipkart_btn.click();
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[1]/div/input")
	WebElement recieverEmail_field;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[2]/div/input")
	WebElement recieverName_Field;

	@FindBy(how = How.XPATH, using = "html/body/div/div/div[3]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[3]/div[2]/div/input")
	WebElement no_of_cards_field;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[4]/div/input")
	WebElement gifterName_Field;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[5]/div/textarea")
	WebElement message_field;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/div/div[1]/div[1]/div[3]/div[1]/div/select")
	WebElement card;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div/div/div/div/div[1]/span[1]")
	public static WebElement gift_result;

	public static By buybtn = By.xpath(
			"/html/body/div/div/div[3]/div/div/div/div/div/div[3]/div/div[2]/div/div[2]/div/div/form/div[3]/button");

	public void buygiftcard(String email, String name, String no_cards, String giftername, String message) {
		recieverEmail_field.sendKeys(email);
		recieverName_Field.sendKeys(name);
		Select cardvalue = new Select(card);
		cardvalue.selectByVisibleText("10000");
		no_of_cards_field.sendKeys(no_cards);
		gifterName_Field.sendKeys(giftername);
		message_field.sendKeys(message);
	}

}
