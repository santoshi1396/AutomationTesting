package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		WebElement ca = driver.findElement(By.id("currentAddress"));
		
		WebElement pa = driver.findElement(By.id("permanentAddress"));
		
		Actions act=new Actions(driver);
		
		
		ca.sendKeys("Shivajinagar, Pune");
		
		/*act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();*/
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		/*act.keyDown(Keys.CONTROL);		
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();*/
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		
		/*act.sendKeys(Keys.TAB);
		act.build().perform();*/
		
		act.sendKeys(Keys.TAB).build().perform();
		
		/*act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();*/
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
