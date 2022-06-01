import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SCMultipleWindowPractice5 {

	public static void main(String[] args) throws InterruptedException {
		
	
		//Selenium wants to invoke chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
			
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.switchTo().newWindow(WindowType.TAB);  //open new tab & window   WindowType.Window & WindowType.Tab
		Set<String> handles = driver.getWindowHandles(); //[parentid, childid]
		Iterator<String> it = handles.iterator();
		String parentId = it.next(); //grab zero index in the set
		String childId = it.next();  //grab first index in the set  ==> moves to the child page
		
		driver.switchTo().window(childId); //activate 2nd tab
		driver.get("https://rahulshettyacademy.com/");
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();	
	
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
		   		   
	}
}



















