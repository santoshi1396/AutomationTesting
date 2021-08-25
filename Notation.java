package Notations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notation {
	public static void main(String args[]) throws InterruptedException{
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://study.com/");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println("Title of Page: "+title);
	
	driver.findElement(By.xpath("//*[@id='heroSearchBar']/div/input")).sendKeys("test@gmail.com");
	driver.findElement(By.xpath("//*[@id='heroSearchBar']/div/button/span")).click();
	
	String title1 = driver.getTitle();
	System.out.println("Title of second page: "+title1);
	Thread.sleep(2000);
	
	driver.navigate().to("https://study.com/academy/course/index.html");
	String title2=driver.getTitle();
	System.out.println("Title of Third page is: "+title2);
	
	

	
	}
}
