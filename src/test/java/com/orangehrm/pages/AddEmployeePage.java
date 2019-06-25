package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;
import com.orangehrm.utils.CommonMethods;

public class AddEmployeePage extends BaseClass{

	@FindBy(xpath="//input[@id='firstName']")
    public WebElement firstName;
    
    @FindBy(id="middleName")
    public WebElement middleName;
    
    @FindBy(id="lastName")
    public WebElement lastName;
    
    @FindBy(id="employeeId")
    public WebElement employeeId;
    
    @FindBy(xpath="//div[@id='location_inputfileddiv']//input")
    public WebElement location;
    
    @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
    public WebElement locationList;
    
    @FindBy(xpath="//input[@id='chkLogin']")
    public WebElement createLoginDetails;
    
    @FindBy(id="systemUserSaveBtn")
    public WebElement saveBtn;
    
    @FindBy(xpath="//span[@id='pim.navbar.employeeName']")
    public WebElement empCheck;
    
    @FindBy (xpath="//form[@id='pimAddEmployeeForm']//label")
    public List<WebElement> addEmpLabels;
    
    @FindBy (xpath="//label[text()='Create Login Details']")
    public WebElement createLoginDetailsCheckbox;
    
    @FindBy (id="username")
    public WebElement userName;
    
    @FindBy (id="password")
    public WebElement password;
    
    @FindBy (id="confirmPassword")
    public WebElement confirmPassword;
    
    @FindBy (xpath="//div[contains(@class,'ng-dirty-add ng-valid-parse-add')]//input")
    public WebElement status;
    
    @FindBy (xpath="//div[@id='essRoleId_inputfileddiv']//input")
    public WebElement essRole;
    
    @FindBy (xpath="//div[@id='supervisorRoleId_inputfileddiv']//input")
    public WebElement superviserRole;
    
    @FindBy (xpath="//div[contains(@id,'adminRoleId_inputfileddiv')]//input")
    public WebElement adminRole;
    
    @FindBy (xpath="//span[@id='pim.navbar.employeeName']")
    public WebElement personalDetails;
     
    public AddEmployeePage() {
        PageFactory.initElements(driver,this);
    }
}