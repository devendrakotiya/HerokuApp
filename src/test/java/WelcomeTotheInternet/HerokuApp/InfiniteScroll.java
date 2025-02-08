package WelcomeTotheInternet.HerokuApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class InfiniteScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Infinite Scroll")).click();
		
//		we can handle this in 2 ways 
//		1st using Actions class
//		Actions action = new Actions(driver);
//		
//		for(int i=0;i<=10;i++)
//		{
////			action.sendKeys(Keys.PAGE_DOWN).perform();
////								or
//			action.keyDown(Keys.PAGE_DOWN).build().perform();
//			try {
//                Thread.sleep(2000);  // Wait for new content to load
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//		}
		
//		2nd way using Javascript executer class
		
		JavascriptExecutor js = (JavascriptExecutor )driver;
		long lastHight = (long)js.executeScript("return document.body.scrollHeight");
		
		while(true)
		{
			js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			
			try {
                Thread.sleep(2000);  // Wait for content to load
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
			
			long newHight = (long) js.executeScript("return document.body.scrollHeight");
			 if (newHight == lastHight) {
	                break;
	            }
			 
			 newHight = lastHight;
			
		}
		
		
		
	}

}
