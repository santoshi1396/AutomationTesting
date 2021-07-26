package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTItle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		

		
		driver.get("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

}
