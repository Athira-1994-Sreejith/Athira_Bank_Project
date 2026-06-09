package com.company.tests;

import com.company.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginFeature() {
        // Pass the active driver from BaseTest into the page object constructor
        LoginPage loginPage = new LoginPage(driver);
        
        // Drive data dynamically from config properties
        loginPage.enterUsername(config.getProperty("UserID"));
        loginPage.enterPassword(config.getProperty("Password"));
        loginPage.clickLogin();
        
        System.out.println("Test executed successfully using config URL: " + config.getProperty("url"));
    }
}