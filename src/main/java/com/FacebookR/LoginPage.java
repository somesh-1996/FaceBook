package com.FacebookR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(tagName="h2")
	private WebElement text;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginbtn;
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement newloginbtn;
	
	public LoginPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getText() {
		return text;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginbtn;
	}
	public WebElement getnewLoginButton() {
		return newloginbtn;
	}
}
