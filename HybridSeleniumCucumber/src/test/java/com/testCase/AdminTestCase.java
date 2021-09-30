package com.testCase;
import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.baseClass.Library;
import com.pages.AdminPage;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class AdminTestCase extends Library{
	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
	}
	 @Test
	    public void login() {
	        LoginPage lpage=new LoginPage(driver);
	        lpage.login("Admin", "admin123");
	       
	    }
	
	   @Test
	    public void admin() {
	        AdminPage apage=new AdminPage(driver);
	        apage.admin("saloni", "SaloniJ");
	       
	    }
	   
	 //  @AfterMethod
	//    public void close() throws IOException,InterruptedException {
	//        SeleniumUtilities sUti = new SeleniumUtilities(driver);
	    //    sUti.to_take_screenshot("src\\main\\resources\\Screenshots\\orangeHRMAdmin.png");
	       
	   //    wait();
	       
	  //  }

}
