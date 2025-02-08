package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HorizantalSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Horizontal Slider")).click();
		WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));

//		using drag and drop method

//		Action class we need to use to handle slider
//		Actions action = new Actions(driver);

//		action.clickAndHold(slider).moveByOffset(50, 0).release().perform(); 

		// Use arrow keys to move the slider (move right and left)

		slider.click();
		Actions actions = new Actions(driver);

		// Move the slider right (simulate pressing the right arrow key)
		actions.sendKeys(Keys.ARROW_RIGHT).perform();

		// Optionally, move the slider left (simulate pressing the left arrow key)
		actions.sendKeys(Keys.ARROW_LEFT).perform();
		
		
	}

}
