package com.company.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    protected WebDriver driver;
    protected Properties prop;

    @BeforeMethod
    public void setUp() throws Exception {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
        prop.load(fis);

        // Crucial for Jenkins execution: Read browser options from Jenkins or Config
        String browser = System.getProperty("browser") != null ? System.getProperty("browser") : prop.getProperty("browser");
        
        if(browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            // Headless flag allows execution on server environments
            if(System.getProperty("headless") != null && System.getProperty("headless").equals("true")) {
                options.addArguments("--headless=new");
            }
            driver = new ChromeDriver(options);
        }
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(prop.getProperty("implicit.wait"))));
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}