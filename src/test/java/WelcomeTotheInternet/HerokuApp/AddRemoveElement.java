package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Add/Remove Elements']")).click();
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.cssSelector("button.added-manually")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
