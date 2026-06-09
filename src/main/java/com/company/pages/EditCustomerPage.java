package com.company.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditCustomerPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	private By customerid = By.name("cusid");
	private By submitbtn =By.name("AccSubmit");
	private By editCustomerMenuLink = By.xpath("//a[contains(@href, 'EditCustomer.php')]");
	
	public  EditCustomerPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void editcustomer() {
		driver.findElement(customerid).sendKeys("ABC123");
		driver.findElement(submitbtn).click();
		
	}
	public void navigateToEditCustomerPage() {
        driver.findElement(editCustomerMenuLink).click();
    }
}
