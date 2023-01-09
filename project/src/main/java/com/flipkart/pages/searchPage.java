package com.flipkart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class searchPage {

	WebDriver driver;

	public searchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")
	WebElement searchBar_field;

	@FindBy(how = How.XPATH, using = "/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/button")
	WebElement search_click;
	
	@FindBy(how=How.XPATH,using="/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
	public static WebElement search_result;

	public void productSearch(String pr) {
		searchBar_field.sendKeys(pr);
		search_click.click();
	}
}
