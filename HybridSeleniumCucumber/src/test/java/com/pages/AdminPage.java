package com.pages;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;
public class AdminPage extends Library{
	
	
	 @FindBy(id="searchSystemUser_userName")
	    WebElement Username;
	    @FindBy(id="searchSystemUser_employeeName_empName")
	    WebElement EmployeeName;
	    @FindBy(id="searchBtn")
	    WebElement SearchButton;
	    
	    public AdminPage(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	    public void admin(String uname,String emplname) {
	        Username.sendKeys(uname);
	        EmployeeName.sendKeys(emplname);
	        
	        SearchButton.click();
	        
	    }


}
