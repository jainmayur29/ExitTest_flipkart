package com.flipkart.pages;

import com.flipkart.utilities.*;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.model.Log;

import io.github.bonigarcia.wdm.WebDriverManager;
import com.relevantcodes.extentreports.LogStatus;

public class basePage {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite
	public void setup() {

		if (ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("chrome")) {

			System.setProperty(ReadingPropertiesFile.getProperty("driver_Chrome"),
					System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
			
			if (ReadingPropertiesFile.getProperty("browser_mode").equalsIgnoreCase("headless")) {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				driver = new ChromeDriver(options);
			}
			else if (ReadingPropertiesFile.getProperty("browser_mode").equalsIgnoreCase("non-headless")) {
				driver = new ChromeDriver();
			}
			else {
				System.out.println("Please select the valid mode");
			}
		}
		else if (ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("firefox")) {

			System.setProperty(ReadingPropertiesFile.getProperty("driver_firefox"),
					ReadingPropertiesFile.getProperty("firefoxpath"));
			if (ReadingPropertiesFile.getProperty("browser_mode").equalsIgnoreCase("headless")) {

				FirefoxOptions options = new FirefoxOptions();
				options.addArguments("headless");
				driver = new FirefoxDriver(options);
				
			} else if (ReadingPropertiesFile.getProperty("browser_mode").equalsIgnoreCase("non-headless")) {
				driver = new FirefoxDriver();
				
			}
			else {
				System.out.println("Please select the valid mode");
			}
		}
		else if (ReadingPropertiesFile.getProperty("browser").equalsIgnoreCase("edge")) {

			System.setProperty(ReadingPropertiesFile.getProperty("driver_edge"),
					ReadingPropertiesFile.getProperty("edgepath"));
			 driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		extent = ExtentManager.getInstance("reports//ExtentReport.html");	
	}

	@BeforeTest
	public void navigateToUrl() {
		driver.get(ReadingPropertiesFile.getProperty("url"));
	}

	@BeforeMethod
	public void startTest(Method method) {
		test = extent.startTest(method.getName());
	}

	@AfterMethod
	public void status(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS)
			test.log(LogStatus.PASS, "Test case got passed");
		else if (result.getStatus() == ITestResult.FAILURE) {
			ScreenShot.takeScreenShot(driver, result.getName());
			test.log(LogStatus.ERROR, result.getThrowable());
			test.log(LogStatus.FAIL, "Test case got failed");
		}
		extent.flush();
	}

	@AfterSuite
	public void tearDown() {
		// quitting the driver
		driver.quit();
	}

}
