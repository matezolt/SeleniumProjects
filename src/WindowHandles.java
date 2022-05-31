import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class WindowHandles {
	
	public static void main(String[] args) throws InterruptedException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		//provide the info about the windows
		Set<String> windows = driver.getWindowHandles(); //[parentid, childid]
		Iterator<String> it = windows.iterator();
		String parentId = it.next(); //grab zero index in the set
		String childId = it.next();  //grab first index in the set  ==> moves to the child page
		
		driver.switchTo().window(childId);
		System.out.println(driver.findElement(By.xpath("//h2/span/strong")).getText());
		String emailId = driver.findElement(By.xpath("//h2/span/strong")).getText();
		
		driver.switchTo().window(parentId);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
	}
}
