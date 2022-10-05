package com.FacebookR;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUppage {
	public static WebDriver driver;
	@FindBy(name="firstname")
	private WebElement firstName;
	@FindBy(name="lastname")
	private WebElement lastName;
	@FindBy(name="reg_email__")
	private WebElement phno;
	@FindBy(id="password_step_input")
	private WebElement password;
	@FindBy(name="sex")
	private WebElement gender;
	@FindBy(id="day")
	private WebElement day;
	@FindBy(id="month")
	private WebElement month;
	@FindBy(id="year")
	private WebElement year;
	@FindBy(xpath="//button[text()='Sign Up']")
	private WebElement signup;
	
	public SignUppage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getPhoneNumber() {
		return phno;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement GetYear() {
		return year;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getSignUp() {
		return signup;
	}
}
