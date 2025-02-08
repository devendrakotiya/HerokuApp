package WelcomeTotheInternet.HerokuApp;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String downloadpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.linkText("File Download")).click();
		driver.findElement(By.linkText("LambdaTest.txt")).click();
		File f = new File("C:\\Users\\Rohit\\Downloads\\LambdaTest.txt");
		
//navigate defauld downlaod path to our project path so that this code works on anyother machcine
//		HashMap<String,Object> chromeprefs = new HashMap<String,Object>();
//		chromeprefs.put("profile.default_content_settings.popups", 0);
//		chromeprefs.put("download.default_directory", downloadpath);
		
//		ChromeOptions options = new ChromeOptions();
//		options.setExperimentalOption("prefs", chromeprefs);
		
//		File f= new File(downloadpath + "/LambdaTest.txt");
//		System.out.println(downloadpath);
		if(f.exists())
		{
			System.out.println("file is sucessfully downloaded.....!!!!.....");
		}
		else 
		{
			System.out.println("not found");
		}
	}

}
