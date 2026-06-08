package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // 1. Locators (Private to avoid accidental tampering)
    private By userid = By.id("message23");
    private By password1 = By.id("message18");
    private By login = By.name("btnLogin");

    // 2. Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Actions (Public)
    public void login(String username, String password) {
        driver.findElement(userid).sendKeys("mngr662739");
        driver.findElement(password1).sendKeys("ehAhEbU");
        driver.findElement(login).click();
    }
}