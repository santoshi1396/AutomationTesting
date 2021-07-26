package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/lenovo/Desktop/index.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Login")).click();
		

	}

}
