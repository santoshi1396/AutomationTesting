package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/lenovo/Desktop/index.html");
		
		driver.manage().window().maximize();
		
		 WebElement ele=driver.findElement(By.tagName("input"));
		 
		 ele.sendKeys("Tom");
		
		 //alternate way 
		 
		By f=By.tagName("input");
		
		WebElement ele1=driver.findElement(f);
		ele1.sendKeys("Jerry");
		
		//another way to send keys in 1 line
		driver.findElement(By.tagName("input")).sendKeys("Cartton");
		
	}

}
