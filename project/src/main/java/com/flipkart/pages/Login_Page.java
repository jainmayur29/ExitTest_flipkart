package com.flipkart.pages;

import com.relevantcodes.extentreports.model.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Login_Page {
	
	WebDriver driver;
	public Login_Page(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	WebElement mobileNumber_field;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")
	WebElement requestOtp_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/button")
	WebElement cross_btn;

	public void login_flipkart(String mobNo) {

		mobileNumber_field.sendKeys(mobNo);
		requestOtp_btn.click();
		cross_btn.click();
	}
}
