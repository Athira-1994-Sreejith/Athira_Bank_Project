package com.company.tests;

import org.testng.annotations.Test;

import com.company.pages.EditCustomerPage;
import com.company.pages.LoginPage;

public class EditCustomerTest extends BaseTest{
	@Test
	public void editingcustomer() {
		try {
			LoginPage loginPage = new LoginPage(driver);
				loginPage.enterUsername(config.getProperty("UserID"));
		        loginPage.enterPassword(config.getProperty("Password"));
		        loginPage.clickLogin();
		        System.out.println("Test executed successfully using config URL: " + config.getProperty("url"));
		        
		        EditCustomerPage edit1 = new EditCustomerPage(driver);
		        edit1.navigateToEditCustomerPage();
		        edit1.editcustomer();
	}
		catch(Exception e) {
			System.out.println("Customer is not edited");
		}
			
		}

}
