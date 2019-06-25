package com.orangehrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="//li[text()='Dashboard']")
	public WebElement dashboardText;
	
	@FindBy(partialLinkText="PIM")
    public WebElement PIM;
	
    @FindBy(partialLinkText="Add Employee")
    public WebElement addEmployee;
	
    @FindBy(xpath="//span[contains(@class,'left-menu-title') and text()='Admin']")
    public WebElement Admin;
	
    @FindBy(xpath="//span[contains(@class,'left-menu-title') and text()='Organization']")
    public WebElement Organization;
    
    @FindBy(xpath="//span[contains(@class,'left-menu-title') and text()='Locations']")
    public WebElement Location;
     
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
