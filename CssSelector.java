package Locators;

import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/lenovo/Desktop/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByCssSelector("input[name='uname']").sendKeys("Tom");
		
		driver.findElementByCssSelector("input[id='pwd']").sendKeys("Test@1234");
		
		driver.get("https://study.com/academy/login.html");
		
		driver.manage().window().maximize();
		
		driver.findElementByCssSelector("input[name='username']").sendKeys("Test@gmail.com");
		
		driver.findElementByCssSelector("input[name='password']").sendKeys("Test@1122");
		

	}

}
