package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\VJ\\eclipse-workspace\\Selenium_Class\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\VJ\\eclipse-workspace\\Selenium_Class\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void navigateTO(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void sendkeys(WebElement element, String input) {
		element.sendKeys(input);
	}

	public static void Screenshot(String src, String dest) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src1 = ts.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\VJ\\eclipse-workspace\\Selenium_Class\\Screenshot\\Pic1.png");
		FileUtils.copyFile(src1, dest1);
	}

	public static void dropdown(WebElement element, String Strvalue) {
		Select s = new Select(element);
		s.selectByValue(Strvalue);
	}

	public static void byindex(WebElement element, int value) {
		Select s = new Select(element);
		s.selectByIndex(value);
	}

	public static void bytext(WebElement element, String text) {
	Select s = new Select(element);
	s.selectByVisibleText(text);
	}
	
	public static void screensnap(String location) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File ("C:\\Users\\VJ\\eclipse-workspace\\Selenium_Class\\Screenshot\\"+location);
		FileUtils.copyFile(src, dest);
	}

	public static void scroll(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();"+element);
	}

//	JavascriptExecutor jn = (JavascriptExecutor) driver;
//	jn.executeScript("arguments[0].scrollIntoView();".Elements);

	public static void actions(WebElement element, String options) {
		Actions act = new Actions (driver);
		if (options.equalsIgnoreCase("move")) {
			act.moveToElement(element).build().perform();
		}
		else if (options.equalsIgnoreCase("double")) {
			act.doubleClick(element).build().perform();
		}
		else if (options.equalsIgnoreCase("context")) {
			act.contextClick().build().perform();
		}
	}

	public static void robot(String options) throws Exception {
		Robot r = new Robot();
		if (options.equalsIgnoreCase("Down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		
		else if (options.equalsIgnoreCase("Up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		
	}

	public static void DD(String options, String S, WebElement element) {
		Select s = new Select(element);
		
		if (options.equalsIgnoreCase("Value")) {
			s.selectByValue(S);	
		}
		else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(S);
		}
		
		else if(options.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(S);
			s.selectByIndex(parseInt);
		}

}
	
	public static void DeslectDD(String options, String DS, WebElement element) {
		Select s = new Select(element);
		
		if (options.equalsIgnoreCase("Value")) {
			s.deselectByValue(DS);
		}
		else if (options.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(DS);
		}
		
		else if(options.equalsIgnoreCase("index")) {
		int parseInt = Integer.parseInt(DS);
			s.deselectByIndex(parseInt);
		}

}

	

	public static void alert(String option) {
		Alert alert = driver.switchTo().alert();
		if (option.equalsIgnoreCase("accept")) {
			alert.accept();	
		}
		else if (option.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
}
	
	public static void getoption(WebElement element) {
		Select s = new Select (element);
		List<WebElement> options = s.getOptions();
		System.out.println(options);
	}
	
	public static void IsMultiple(WebElement element ) {
		Select s = new Select (element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);	
	}

	public static void GetAllSelectedoptions(WebElement element) {
		Select s = new Select (element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement alloption : allSelectedOptions) {
			String text = alloption.getText();
			System.out.println(text);
		}
	}
	
	public static void GetFirstSelectedoptions(WebElement element) {
		Select s = new Select (element);
	    WebElement firstSelectedOption = s.getFirstSelectedOption();
	    String text = firstSelectedOption.getText();
	    System.out.println(text);
	}

	public static void deselect(WebElement element) {
		Select s = new Select (element);
		s.deselectAll();
	}
	
	public static void FrameEle(WebElement element) {
		driver.switchTo().frame(element);
	}
	
	public static void Frameindex (int value) {
		driver.switchTo().frame(value);
	}
	
	public static void FrameStr (String S) {
		driver.switchTo().frame("S");
	}
	
	public static void sleep(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	
	
	
	

}

