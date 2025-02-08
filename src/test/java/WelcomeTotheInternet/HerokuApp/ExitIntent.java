package WelcomeTotheInternet.HerokuApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExitIntent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.linkText("Exit Intent")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'Close')]")));
		
		Actions action = new Actions(driver);
		
		action.moveByOffset(0, -500).perform();
		
		driver.findElement(By.xpath("//p[contains(text(),'Close')]")).click();
		driver.close();
		
		
	}

}
