package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Dropdown")).click();
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));  
		Select select = new Select(dropdown);
//		select.selectByIndex(1);
//		select.selectByIndex(2);
//		select.selectByValue("2");
		select.selectByVisibleText("Option 1");
		driver.close();
	}

}
