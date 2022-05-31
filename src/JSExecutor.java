import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class JSExecutor {
	
	public static void main(String[] args) throws InterruptedException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//Scroll on the page
		js.executeScript("window.scrollBy(0,500)");  				//
		Thread.sleep(3000);
		//Scroll within a table
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		
	}
}
