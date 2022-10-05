package com.facebook;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.FacebookR.Baseclass;
import com.FacebookR.ConfigurationHelper;
import com.FacebookR.LoginPage;
import com.FacebookR.SignUppage;
import com.FacebookR.SingleTonDesignPattern;

public class Facebook extends Baseclass {
	public static WebDriver driver = null;

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		String browser = ConfigurationHelper.getInstance().getBrowser();
		driver = browserLaunch(browser);
		SingleTonDesignPattern sdp = new SingleTonDesignPattern(driver);

		String url = ConfigurationHelper.getInstance().geturl();
		launchURL(url);
		implicitlyWait(10);
		String t = printText(sdp.getLoginPage().getText());
		System.out.println(t);
		String un = ConfigurationHelper.getInstance().getusername();
		userInput(sdp.getLoginPage().getUsername(),un);
		String pw = ConfigurationHelper.getInstance().getPassword();
		userInput(sdp.getLoginPage().getPassword(), pw);
		clickOnElement(sdp.getLoginPage().getLoginButton());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ram = ts.getScreenshotAs(OutputType.FILE);
		String screenshot1 = ConfigurationHelper.getInstance().getScreenshot1();
		File dest = new File(screenshot1);
		FileUtils.copyFile(ram, dest);
		navigation();
		clickOnElement(sdp.getLoginPage().getnewLoginButton());
		sleep();
		String firstname = ConfigurationHelper.getInstance().getFirstName();
		userInput(sdp.getSignUppage().getFirstName(), firstname);
		String lastname = ConfigurationHelper.getInstance().getLastName();
		userInput(sdp.getSignUppage().getLastName(), lastname);
		String phonenumber = ConfigurationHelper.getInstance().getPhoneNumber();
		userInput(sdp.getSignUppage().getPhoneNumber(), phonenumber);
		String password1 = ConfigurationHelper.getInstance().getPassword1();
		userInput(sdp.getSignUppage().getPassword(), password1);
		selectDropDown(sdp.getSignUppage().getDay(), "value", "22");
		selectDropDown(sdp.getSignUppage().getMonth(), "value", "11");
		selectDropDown(sdp.getSignUppage().GetYear(), "value", "1996");
		clickOnElement(sdp.getSignUppage().getGender());
		clickOnElement(sdp.getSignUppage().getSignUp());
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File ram1 = ts1.getScreenshotAs(OutputType.FILE);
		String screenshot2 = ConfigurationHelper.getInstance().getScreenshot2();

		File dest1 = new File(screenshot2);
		FileUtils.copyFile(ram1, dest1);
		close();
	}

}
