package com.pages;
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
public class JobCategoriesPage extends Library {
	 @FindBy(xpath="//*[@id=\"menu_admin_viewAdminModule\"]/b")
	 WebElement ADmin;
	 @FindBy(id="menu_admin_Job")
	 WebElement Job;
	 @FindBy(id="menu_admin_jobCategory")
	 WebElement JobCategories;
	
	 
	  public JobCategoriesPage(WebDriver driver) {
	        this.driver=driver;
	        PageFactory.initElements(driver, this);
	    }
	  
	  public void jobcategories() {
	       
	        
		  JobCategories.click();

}
}
