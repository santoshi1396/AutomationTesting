package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("https://study.com/academy/login.html");
		driver.get("file:///C:/Users/lenovo/Desktop/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.tagName("input")).sendKeys("Tom");    //input locator
		driver.findElement(By.id("pwd")).sendKeys("Test@123");		//id locator

		
	}

}
