package com.orangehrm.stepDefinitions;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;
import com.orangehrm.utils.DbUtils;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	// global pre-condition
	@Before
	public void start(Scenario scenario) {
		System.out.println("Starting test:" + scenario.getName());
		BaseClass.setUp();
	}

	@After
	public void end(Scenario scenario) {
		System.out.println("Ending test:" + scenario.getName());
		if (scenario.isFailed()) {
			byte[] shot = CommonMethods.takeScreenShot();
			scenario.embed(shot, "image/png");
		}
		BaseClass.tearDown();
	}
	// pre - condition for frontEnd and BackEnd matching test  
	@Before("@db")
	public void open() {
		DbUtils.createConnection();
	}

	@After("@db")
	public void close() {
		DbUtils.closeConnection();
	}
	
	
	
	

}
