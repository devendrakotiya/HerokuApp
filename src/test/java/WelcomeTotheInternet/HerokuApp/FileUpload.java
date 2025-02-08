package WelcomeTotheInternet.HerokuApp;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Upload")).click();
		driver.findElement(By.id("drag-drop-upload")).click();
		 
//		instead of runtime use processbuilder class to run autoit script 
		
//		Runtime.getRuntime().exec("C:\\Users\\Rohit\\Documents\\LambdaFileUpload2.exe");
		
		 try {
	            ProcessBuilder processBuilder = new ProcessBuilder("C:\\Users\\Rohit\\Documents\\uploadfile.exe");
	            processBuilder.start(); // Run AutoIt script

	            // Continue with the Selenium actions (e.g., clicking submit)
//	            driver.findElement(By.id("submitButton")).click();

	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	        	System.out.println("file uploaded");
	            driver.quit(); // Close the browser
	        }
		
		 
		 driver.findElement(By.id("file-submit")).click();
		
		
		
		
		
		
		
		
		
	}

}
