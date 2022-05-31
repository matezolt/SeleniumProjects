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


public class SCRightClickPractice4 {

	public static void main(String[] args) throws InterruptedException {
		
	
		//Selenium wants to invoke chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		driver.get("http://the-internet.herokuapp.com/context_menu");
		
		Actions action = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("div#hot-spot"));
		
//		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//		//moves to specific element /(tick in mobiles)
		action.moveToElement(move).contextClick().build().perform();  //right click
		System.out.println(driver.switchTo().alert().getText());
			
	}
}



















