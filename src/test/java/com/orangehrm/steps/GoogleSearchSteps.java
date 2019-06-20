package com.orangehrm.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver;
	
	@Given("I navigated to the Google page")
	public void i_navigated_to_the_Google_page() {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}

	@When("I type the item to search")
	public void i_type_the_item_to_search() {
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("a lunch box for a boy");
		
	}

	@When("I click on search button")
	public void i_click_on_search_button() {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	}

	@Then("I see the search results are displayed")
	public void i_see_the_search_results_are_displayed() {
		System.out.println("Results are displayed");	
		driver.close();
	}
}
