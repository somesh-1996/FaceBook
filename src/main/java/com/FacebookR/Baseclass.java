package com.FacebookR;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-Selenium class\\IPTfresh\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("gecko")){
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Invalid browser");
		}
		driver.manage().window().maximize();
		return driver;
	}
	public static void selectDropDown(WebElement element,String Options,String value) {
		Select s=new Select(element);
		if(Options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if(Options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
		else if(Options.equalsIgnoreCase("index")) {
			int n=Integer.parseInt(value);
			s.selectByIndex(n);
			}
		else {
			System.out.println("invalid selector");
		}
	}
	public static void launchURL(String url) {
		driver.get(url);
	}
	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static void printURL() {
		String url = driver.getCurrentUrl();
		System.out.println("the page URL is:"+url);
	}
	public static String printText(WebElement element) {
		String text=element.getText();
		System.out.println("the text is:"+text);
		return text;
	}
	public static void printTitle() {
		String title=driver.getTitle();
		System.out.println(title);
	}
	public static void isEnabled(WebElement element) {
		boolean check = element.isEnabled();
		System.out.println("the check whether element is enabled:"+check);
	}
	public static void alertAccept(String alert) {
		Alert a= driver.switchTo().alert();
		if(alert.equalsIgnoreCase("ok")) {
			a.accept();
		}
		else if(alert.equalsIgnoreCase("cancel")) {
			a.dismiss();
		}
	}
	public static void userInput(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void navigation() {
		driver.navigate().back();
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void sleep() throws InterruptedException {
		Thread.sleep(3000);
	}
}
