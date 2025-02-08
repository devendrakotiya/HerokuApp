package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert jsalert = driver.switchTo().alert();
		
		jsalert.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert jsconfirm = driver.switchTo().alert();
		
		jsconfirm.accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert jspromt = driver.switchTo().alert();
		
		jspromt.sendKeys("devendra");
		jspromt.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
