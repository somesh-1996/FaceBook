package com.ipt.se9.IPTfresh;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicFacebook {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse-Selenium class\\IPTfresh\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement Username=driver.findElement(By.id("email"));
		String value=XLSXReader.particulardata("Amazon",1,0);
		Username.sendKeys(value);
		WebElement Password = driver.findElement(By.id("pass"));
		String value1=XLSXReader.particulardata("Amazon",1,0);
		Password.sendKeys(value1);
		driver.findElement(By.tagName("h2"));
		WebElement text=driver.findElement(By.tagName("h2"));
		String writevalue=text.getText();
		XLSXWriter.writeData("writeIPT",1,0,writevalue);
		System.out.println("done");
	}

}
