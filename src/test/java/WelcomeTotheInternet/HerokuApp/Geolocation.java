package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Geolocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
        
        // Automatically allow geolocation permission
        options.addArguments("--use-fake-ui-for-media-stream");
        options.addArguments("--enable-geolocation");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Geolocation")).click();
		driver.findElement(By.cssSelector("button[onclick='getLocation()']")).click();
		
	}

}
