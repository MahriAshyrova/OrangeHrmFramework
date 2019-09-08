package com.orangehrm.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class AddSkillsPage extends BaseClass {
	
	@FindBy(linkText="add")
    public WebElement AddSkills;
    
    @FindBy(id="name")
    public WebElement Name;
    
    @FindBy(id="description")
    public WebElement description;
    
    @FindBy(xpath="//a[text()='Save']")
    public WebElement saveBtn;
    
    @FindBy(xpath="//table[@class='highlight bordered']/tbody/tr")
    public List<WebElement> VerifySkills;
    
	public AddSkillsPage() {
		PageFactory.initElements(driver, this);
	}
}

