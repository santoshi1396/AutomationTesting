package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver= new FirefoxDriver();
		
		driver.get("file:///C:/Users/lenovo/Desktop/index.html");
		
		driver.findElement(By.name("uname")).sendKeys("Cartoon");
	}

}
