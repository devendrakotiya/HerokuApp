package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Context Menu")).click();
		
//		Action class
		Actions action = new Actions(driver);
//		right click
		action.contextClick(driver.findElement(By.id("hot-spot"))).perform();
//		now we need to handle alerts
//		System.out.println(driver.switchTo().alert().accept().getText());
//		driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
