package WelcomeTotheInternet.HerokuApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Frames")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
//		WebElement frame = driver.findElement(By.cssSelector("frame[name='frame-middle']"));
		WebElement frame = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("frame[name='frame-middle']")));
		driver.switchTo().frame(frame);
		System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
	}

}
