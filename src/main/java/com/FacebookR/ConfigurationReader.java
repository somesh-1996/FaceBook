package com.FacebookR;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	public static Properties p;
	public ConfigurationReader() throws IOException {
		File f=new File("C:\\Users\\hp\\eclipse-Selenium class\\IPTfresh\\src\\main\\java\\com\\FacebookR\\property.properties");
		FileInputStream fi=new FileInputStream(f);
		p=new Properties();
		p.load(fi);
	}
	public static String getBrowser() {
		String browser=p.getProperty("browser");
		return browser;
	}
	public static String geturl() {
		String url=p.getProperty("url");
		return url;
	}
	public static String getusername() {
		String username=p.getProperty("username");
		return username;
	}
	public static String getPassword() {
		String password=p.getProperty("password");
		return password;
	}
	public static String getFirstName() {
		String firstname = p.getProperty("firstname");
		return firstname;
	}
	public static String getLastName() {
		String lastname = p.getProperty("lastname");
		return lastname;
	}
	public static String getPhoneNumber() {
		String phonenumber=p.getProperty("phonenumber");
		return phonenumber;
	}
	public static String getPassword1() {
		String password1=p.getProperty("password1");
		return password1;
	}
	public static String getScreenshot1() {
		String screenshot1=p.getProperty("screenshot1");
		return screenshot1;
	}
	public static String getScreenshot2() {
		String screenshot2=p.getProperty("screenshot2");
		return screenshot2;
	}
}
	
