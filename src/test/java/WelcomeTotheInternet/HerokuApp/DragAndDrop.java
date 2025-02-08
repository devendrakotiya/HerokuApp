package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Drag and Drop")).click();
		
//		Action class
		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("column-a"));
		WebElement target = driver.findElement(By.id("column-b"));
		
		action.dragAndDrop(source, target).perform();
		action.dragAndDrop(target, source).perform();
		driver.close();
		
	}

}
