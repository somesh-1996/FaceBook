package com.FacebookR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SingleTonDesignPattern {
public WebDriver driver;
public SingleTonDesignPattern(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver,this);
}
public LoginPage getLoginPage() {
	LoginPage lp=new LoginPage(driver);
	return lp;
}
public SignUppage getSignUppage() {
	SignUppage sp=new SignUppage(driver);
	return sp;
}
}
