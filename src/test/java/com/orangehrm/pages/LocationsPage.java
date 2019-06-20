package com.orangehrm.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.utils.BaseClass;

public class LocationsPage extends BaseClass{
	
	@FindBy(partialLinkText="add")
	 public WebElement addLocation;
	
	@FindBy(id="name")
    public WebElement Name;
	
	@FindBy(xpath="//div[contains(@id,'countryCode_inputfileddiv')]//input")
    public WebElement SelectCountry;
	
	@FindBy(xpath="//div[contains(@id,'countryCode_inputfileddiv')]//ul")
    public WebElement countryList;
	  
    @FindBy(id="city")
    public WebElement City;
    
    @FindBy(id="zipCode")
    public WebElement zipCode;
	
  //label[text()='Zip/Postal Code']
    @FindBy(xpath="//a[text()='Save']")
    public WebElement saveBtn;
    
    @FindBy(xpath="//table[@class='highlight bordered']/tbody/tr")
    public List<WebElement> locationCheck;
    
    @FindBy(xpath=" //table[@class='highlight bordered']/tbody/tr/td[7]")
    public List<WebElement> locationEdit;
 
    
    public LocationsPage() {
		PageFactory.initElements(driver, this);
	}
		

}
