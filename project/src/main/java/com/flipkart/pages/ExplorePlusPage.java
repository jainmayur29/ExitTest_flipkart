package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ExplorePlusPage {
	WebDriver driver;

	public ExplorePlusPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Explore Plus")
	WebElement explorePlus_btn;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[3]/div/div[1]/div/a/div/div/img[2]")
	WebElement checkBalance_btn;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div[3]/div/div[2]/div/div[1]/div/div[1]")
	public static WebElement coin_result;

	public void coin() {
		explorePlus_btn.click();
		checkBalance_btn.click();
	}

}
