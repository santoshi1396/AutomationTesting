package Locators;

import java.io.Closeable;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.CloseWindow;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver =new FirefoxDriver();
		
		driver.navigate().to("https://www.study.com/");
		
		 String title1=driver.getTitle();
		 System.out.println(title1);
		 
		 String url1=driver.getCurrentUrl();
		 System.out.println(url1);
		
		 Thread.sleep(5000);
		 
		 driver.navigate().to("https://www.amazon.in/");
		 
		 String title2 = driver.getTitle();
		 System.out.println(title2);
		 
		 String url2=driver.getCurrentUrl();
		 System.out.println(url2);
		 
		 Thread.sleep(5000);
		 
		 driver.navigate().back();
		 String title3=driver.getTitle();
		 System.out.println(title3);
		 
		 String url3=driver.getCurrentUrl();
		 System.out.println(url3);
		 
		 Thread.sleep(5000);
		 
		 driver.navigate().forward();
		 String title4=driver.getTitle();
		 System.out.println(title4);
		 
		 String url4=driver.getCurrentUrl();
		 System.out.println(url4);
		 
		 Thread.sleep(5000);
		 
		 driver.navigate().refresh();
		 String title5=driver.getTitle();
		 System.out.println(title5);
		 
		 String url5=driver.getCurrentUrl();
		 System.out.println(url5);
		 
		 Thread.sleep(4000);
		 
		 driver.close();
		 
		 
		 
	}

}
