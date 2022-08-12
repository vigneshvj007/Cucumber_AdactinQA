package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com\\stepdefinition", monochrome=true,
plugin= {"html:Reports\\htmlreport\\report.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Test_Runner {
public static WebDriver driver;
	@BeforeClass
	public static void setUp() {
		driver=Base_Class.browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() throws InterruptedException {
		Thread.sleep(7000);
		Base_Class.quit();
	}

}
