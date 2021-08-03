package ActionClass;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		
		driver.manage().window().maximize();
		
		WebElement src = driver.findElement(By.id("draggable"));
		
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		//act.dragAndDrop(src,dest).build().perform();
		
		//act.dragAndDropBy(src, 150, 120).build().perform();
		
		//act.clickAndHold(src).perform();
		//act.release(dest).perform();
		act.clickAndHold(src).release(dest).build().perform();
		
	}

}
