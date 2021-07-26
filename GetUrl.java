package Test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GetUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.youtube.com/");
		String url=driver.getCurrentUrl();
		System.out.println("Current url is: "+url);

	}

}
