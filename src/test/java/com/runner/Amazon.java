package com.runner;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.ipt.se9.IPTfresh.XLSXReader;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-Selenium class\\IPTfresh\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		String expectedvalue=	XLSXReader.particulardata("Amazon", 2, 0);
		String expectedresult = XLSXReader.particulardata("Amazon", 2, 1);

		//		Actions a = new Actions(driver);
		//		a.moveToElement(dropdown).perform();
		//		a.click().perform();
		//		
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String actualvalue = options.get(i).getText();
			if (expectedvalue.equals(actualvalue)) {
				s.selectByVisibleText(actualvalue);	
			}
		}

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(expectedresult);
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		for (int i = 1; i <=suggestions.size(); i++) {
			WebElement a = driver.findElement(By.xpath("//div[@class='autocomplete-results-container']/div["+i+"]/div/div"));
			String text = a.getText();
			if (expectedresult.equalsIgnoreCase(text)) {
				a.click();	
				break;
			}	
		}
		System.out.println("completed");

	}
}


