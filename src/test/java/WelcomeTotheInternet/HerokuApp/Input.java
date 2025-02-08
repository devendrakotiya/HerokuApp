package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Inputs")).click();
		WebElement inputField = driver.findElement(By.xpath("//div/input"));
		Actions action = new Actions(driver); 
		action.moveToElement(inputField).perform();
		try {
            Thread.sleep(1000); // Wait for 1 second to ensure the counter appears
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
//		MISSION FAILED I DON'T KNOW HOE TO LOCATE UP/DOWN ARROW IF ANYONE KNOW TELL ME
		
		
		 WebElement upArrow = (WebElement) ((JavascriptExecutor) driver)
		            .executeScript("return document.querySelector('.up-arrow');");
		        WebElement downArrow = (WebElement) ((JavascriptExecutor) driver)
		            .executeScript("return document.querySelector('.down-arrow');");

		
		        if (upArrow != null) {
		            upArrow.click();  // Click the up arrow
		        }

		        if (downArrow != null) {
		            downArrow.click();  // Click the down arrow
		        }

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
