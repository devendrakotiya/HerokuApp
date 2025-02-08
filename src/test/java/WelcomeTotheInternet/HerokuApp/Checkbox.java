package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Checkboxes")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox'][1]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected());
		driver.close();
	}

}
