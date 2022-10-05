package com.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.ipt.se9.IPTfresh.XLSXReader;
import com.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver driver=RunnerClass.driver;
	
	@Given("type The Url Of The Application")
	public void type_The_Url_Of_The_Application() {
		driver.get("https://www.amazon.in/");

	}

	@When("user Click The Dropdown Option")
	public void user_Click_The_Dropdown_Option() throws IOException {
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		String expectedvalue=	XLSXReader.particulardata("Amazon", 2, 0);
		Select s = new Select(dropdown);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String actualvalue = options.get(i).getText();
			if (expectedvalue.equals(actualvalue)) {
				s.selectByVisibleText(actualvalue);	
			}
		}
	}

	@When("type Soft Toy In The Search Box")
	public void type_Soft_Toy_In_The_Search_Box() throws IOException, InterruptedException {
		String expectedresult = XLSXReader.particulardata("Amazon", 2, 1);

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
	}

	@Then("click On The Soft Toy Suggestion")
	public void click_On_The_Soft_Toy_Suggestion() {
	    
	}

	@When("find The Number Of Products In Results")
	public void find_The_Number_Of_Products_In_Results() {
	    
	}

	@When("find The Number of products in more results")
	public void find_The_Number_of_products_in_more_results() {
	   
	}

	@Then("print the result")
	public void print_the_result() {
	    
	}


}