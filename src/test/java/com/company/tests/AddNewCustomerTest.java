package com.company.tests;

import org.testng.annotations.Test;

import com.company.pages.AddnewcustomerPage;
import com.company.pages.LoginPage;

public class AddNewCustomerTest extends BaseTest{
	@Test
	
	public void addingnewcustomer() {
		try {
	LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUsername(config.getProperty("UserID"));
        loginPage.enterPassword(config.getProperty("Password"));
        loginPage.clickLogin();
        System.out.println("Test executed successfully using config URL: " + config.getProperty("url"));
        
        AddnewcustomerPage Newcustomer = new AddnewcustomerPage(driver);
        Newcustomer.clickaddnewcustomeroption();
		Newcustomer.addingnewCustomer();
		Newcustomer.handlingalerts();
       System.out.println("New customeris added");
       
       }
       catch(Exception e) {
    	   System.out.println("New Customer is not added");
    	   
       }
       
       finally{
       
       driver.quit();
	}}
	

}
