package com.company.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;


public class AddnewcustomerPage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	private By customername = By.xpath("//input[@name='name']");
	private By radio2 = By.xpath("//input[@name='rad1']");
	private By address =By.xpath("//textarea[@name='addr']");
	private By city = By.xpath("//input[@name='city']");
	private By state = By.xpath("//input[@name='state']");
	private By pIN = By.xpath("//input[@name='pinno']");
	private By Ph = By.xpath("//input[@name='telephoneno']");
	private By email = By.xpath("//input[@name='emailid']");
	private By submit = By.xpath("//input[@value='Submit']");
	private By exactLink = By.xpath("//a[@href='addcustomerpage.php']");
	
	public AddnewcustomerPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
	public void clickaddnewcustomeroption() {
		driver.findElement(exactLink).click();
		
	}
	public void addingnewCustomer() {
		driver.findElement(customername).sendKeys("Athira");
		WebElement genderRadio = driver.findElement(radio2);
		System.out.println(genderRadio.isSelected());
		if(genderRadio.isSelected()==false) {
			genderRadio.click();
			System.out.println("gender is selected");
		}
		driver.findElement(address).sendKeys("Definer HI Life");
		driver.findElement(city).sendKeys("Bangalore");
		driver.findElement(state).sendKeys("Karnataka");
		driver.findElement(pIN).sendKeys("670741");
		driver.findElement(Ph).sendKeys("1234567890");
		driver.findElement(email).sendKeys("athirasubhash21@gmail.com");
		driver.findElement(submit).click();
	}
	
	public void handlingalerts() {
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

	

}
