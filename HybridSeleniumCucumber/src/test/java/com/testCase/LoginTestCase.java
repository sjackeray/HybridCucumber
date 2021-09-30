package com.testCase;

import java.io.IOException;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.baseClass.Library;
import com.pages.LoginPage;
import com.seleniumReusableFunctions.SeleniumUtilities;

public class LoginTestCase extends Library{

	@BeforeTest
    public void stratUp() {
        launchApplication("chrome","https://opensource-demo.orangehrmlive.com/");
       
    }
    @Test
    public void login() {
        LoginPage lpage=new LoginPage(driver);
        lpage.login("Admin", "admin123");
       
    }
   // @AfterClass
    //public void close() throws IOException,InterruptedException {
      //  SeleniumUtilities sUti = new SeleniumUtilities(driver);
        //sUti.to_take_screenshot("src\\main\\resources\\Screenshots\\orangeHRMLogin.png");
       
       //wait();
       
    //}

}
