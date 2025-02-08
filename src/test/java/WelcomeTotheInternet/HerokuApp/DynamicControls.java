package WelcomeTotheInternet.HerokuApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicControls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		WebElement dynamicEle1 = driver.findElement(By.cssSelector("input[type='checkbox']"));
		dynamicEle1.click();
//		button[onclick='swapCheckbox\()']
		WebElement removebutton = driver.findElement(By.cssSelector("button[onclick='swapCheckbox\\()']"));
		removebutton.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[id='message']")));
		removebutton.click();
		
		
		
		
	}

}
