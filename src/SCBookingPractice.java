import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SCBookingPractice {

	public static void main(String[] args) throws InterruptedException {
		
	
		//Selenium wants to invoke chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
			
		driver.get("https://www.phptravels.net/login");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("user@phptravels.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("demouser");
		
		driver.findElement(By.cssSelector("div.btn-box.pt-3.pb-4 button[type='submit']")).click();
		Set<String> windows = driver.getWindowHandles(); //[parentid, childid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next(); //grab zero index in the set
		String childId = it.next();  //grab first index in the set  ==> moves to the child page
		
		driver.switchTo().window(childId);		
		driver.manage().window().maximize();		
		driver.findElement(By.xpath("//a[text()='Hotels']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("div[data-select2-id*='6']")).click();
		driver.findElement(By.cssSelector("div[data-select2-id*='6']")).sendKeys("dub");
		Thread.sleep(1000);
														//store all the options in a list
		List<WebElement> options =driver.findElements(By.cssSelector("li[class*='select2']"));
		
		for(WebElement option :options) {
			if(option.getText().equalsIgnoreCase("Dubai")) {  //use get text to get the final value
				option.click();
				break;
			}
			
		}
			
	}
}



















