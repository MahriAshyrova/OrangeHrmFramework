package com.orangehrm.stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class LoginSteps extends CommonMethods {
	LoginPage login;
	
	@Given("I navigated to OrangeHrm")
	public void i_navigated_to_OrangeHrm() {
	  setUp();
	}

	@Given("I see OrangeHrm logo")
	public void i_see_OrangeHrm_logo() {
	  login=new LoginPage();
	   boolean isDisplayed=login.logo.isDisplayed();
	   Assert.assertTrue(isDisplayed);
	}

	@When("I enter valid userName and Password")
	public void i_enter_valid_userName_and_Password() {
	    sendText(login.userName, "Admin");
	    sendText(login.password, "caJJ4JBu@0");    
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
	    click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
	    HomePage home=new HomePage();
	    Assert.assertTrue(home.dashboardText.isDisplayed());
	}
	
	@Then("I close the browser")
	public void i_close_the_browser() {
	    tearDown();
	}
	
	@When("I enter invalid userName and Password")
	public void i_enter_invalid_userName_and_Password() {
	   sendText(login.userName, "Test");
	   sendText(login.password, "tester");
	}

	@Then("I see the error message is displayed")
	public void i_see_the_error_message_is_displayed() {
	   Assert.assertTrue(login.errorMessage.isDisplayed());
	   String actual=login.errorMessage.getText();
	   Assert.assertEquals("Invalid Credentials", actual.trim());
	}
	
	
	@When("I enter invalid username and password I see the errorMessage")
	public void i_enter_invalid_username_and_password_I_see_the_errorMessage(DataTable wrongCredentials) {
		
		List<Map<String, String>> maps= wrongCredentials.asMaps(String.class, String.class);
		for(Map<String, String> map : maps) {
			// passing userName and Password values from dataTable/map
			sendText(login.userName, map.get("username"));
			sendText(login.password, map.get("password"));
			click(login.loginBtn);
			String expected=map.get("errorMessage");
			String actual=login.errorMessage.getText().trim();
			Assert.assertEquals(expected, actual);	
		}
	}

	
}
