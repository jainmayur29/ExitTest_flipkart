package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class sellerPage {
	WebDriver driver;

	public sellerPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[4]/a/span")
	WebElement seller_btn;

	@FindBy(how = How.LINK_TEXT, using = "Fee Structure")
	WebElement feeStructure_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[6]/table/table/tbody/tr[1]/td[2]")
	WebElement localCharge;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[6]/table/table/tbody/tr[1]/td[3]")
	WebElement zonalCharge;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[2]/div[6]/table/table/tbody/tr[1]/td[4]")
	WebElement NationalCharge;

	public void sell() {
		seller_btn.click();
		feeStructure_btn.click();
	}

	public static By localCharge1 = By.xpath("/html/body/div[1]/div[2]/div[6]/table/table/tbody/tr[1]/td[2]");
	public static By ZonalCharge1 = By.xpath("/html/body/div[1]/div[2]/div[6]/table/table/tbody/tr[1]/td[3]");
	public static By NationalCharge1 = By.xpath("/html/body/div[1]/div[2]/div[6]/table/table/tbody/tr[1]/td[4]");

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[1]/div/div[2]/div[1]/button")
	WebElement startSelling_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/form/div[1]/div[1]/div/div[2]/input")
	WebElement sellerMobileNumber_field;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/form/div[1]/div[2]/div[2]/input")
	WebElement sellerEmail_Field;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/form/div[1]/div[3]/div[2]/div/div/div[2]/input")
	WebElement sellerGST_Field;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div[1]/div/form/footer/button")
	WebElement registerAndContinue_btn;

	public void seller(String mobno, String email, String gst) {
		startSelling_btn.click();
		sellerMobileNumber_field.sendKeys(mobno);
		sellerEmail_Field.sendKeys(email);
		sellerGST_Field.sendKeys(gst);
		registerAndContinue_btn.click();
	}
}
