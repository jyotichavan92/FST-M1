package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		//Open the browser
		driver.get(" https://training-support.net/selenium/dynamic-attributes");

		String pageTitle= driver.getTitle();
		System.out.println("Title of the page is : "+pageTitle);
		
		 
        //Find username and password fields
        WebElement userName = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        
        //Type credentials
        userName.sendKeys("Jyoti");
        password.sendKeys("Password123");
        confirmPassword.sendKeys("Password123");
        email.sendKeys("jyoti@email.com");
        //Click Sign Up
        driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
        
        //Print login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + loginMessage);
        
        //Close browser
        driver.close();
	}

}
