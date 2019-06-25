package com.orangehrm.stepDefinitions;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import com.orangehrm.pages.AddEmployeePage;
import com.orangehrm.pages.HomePage;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.ConfigsReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddEmployeeSteps extends CommonMethods {

	HomePage home;
	AddEmployeePage addEmp;

	@Given("I logged into OrangeHrm")
	public void i_logged_into_OrangeHrm() {
		LoginPage login = new LoginPage();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
	}

	@When("I click on PIM link")
	public void i_click_on_PIM_link() {
		home = new HomePage();
		click(home.PIM);
	}

	@When("I click on Add Employee link")
	public void i_click_on_Add_Employee_link() {
		waitForElementBeVisible(home.addEmployee, 20);
		click(home.addEmployee);
	}

	@When("I provide Employee details {string} and {string} and {string}")
	public void i_provide_Employee_details_and_and(String fName, String lName, String loc) {
		addEmp= new AddEmployeePage();
		sendText(addEmp.firstName, fName);
		sendText(addEmp.lastName, lName);
		click(addEmp.location);
		selectList(addEmp.locationList, loc);
	}

	@When("I click on save button")
	public void i_click_on_save_button() {
		waitForElementBeClickable(addEmp.saveBtn, 10);
		click(addEmp.saveBtn);
	}

	@Then("I see the following labels")
	public void i_see_the_following_labels(DataTable addEmpLabels) {
		addEmp= new AddEmployeePage();
		List<String>expectedLabels=addEmpLabels.asList();
		System.out.println("--------Pringting labels from Cucumber Data Table");
		for (String label: expectedLabels) {
			System.out.println(label);
		}
		
		// create an empty ArrayList where we store labels text
		List<String> actualLabels=new ArrayList<String>();
		
		// get all label elements 
		System.out.println("----------Pringting labels text from the aplication");
		List<WebElement> labelList=addEmp.addEmpLabels;
		for(WebElement label: labelList) {
		String labeltxt=label.getText();
		// if text is not empty replace * and store it inside actualLabels
		if(!labeltxt.isEmpty()) {
			actualLabels.add(labeltxt.replace("*", ""));
		}
	} 
		Assert.assertTrue(actualLabels.equals(expectedLabels));
}	
		@When("I click on create login details")
		public void i_click_on_create_login_details() {
			//addEmp= new AddEmployeePage();
			click(addEmp.createLoginDetailsCheckbox);
		}

		@When("I provide all mandotory fields {string} and {string} and {string} and {string} and {string}")
		public void i_provide_all_mandotory_fields_and_and_and_and(String UserName, String Password, String ConfirmPassword, String ESSRole, String SuperviserRole) {
		addEmp= new AddEmployeePage();  
		sendText(addEmp.userName, UserName);	
		sendText(addEmp.password, Password);
		waitForElementBeVisible(addEmp.confirmPassword, 20);
		sendText(addEmp.confirmPassword, ConfirmPassword);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, -400)"); 
		waitForElementBeVisible(addEmp.essRole, 20);
		click(addEmp.essRole);
		addEmp.essRole.sendKeys(Keys.ENTER);
		//selectList(addEmp.essRole, ESSRole);
		click(addEmp.superviserRole);
		addEmp.superviserRole.sendKeys(Keys.ENTER);
		//selectList(addEmp.superviserRole, SuperviserRole);	
		}
		
		@Then("I see employee {string} and {string} are added successfully")
		public void i_see_employee_and_are_added_successfully(String fName, String lName) {
			waitForElementBeVisible(addEmp.empCheck, 20);
			Assert.assertTrue(addEmp.empCheck.isDisplayed());
			Assert.assertEquals(fName+" "+lName, addEmp.empCheck.getText().trim());
		}
		
		
		@When("I provide employee details")
		public void i_provide_employee_details() {
		// data comes from an excel	
			//for()
		//	sendText(addEmp.firstName, valueFromEachCell);	
			
		}
		
		
		
		
	}