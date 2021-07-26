package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
	
		driver.close();
		
		driver.quit();
	}

}
