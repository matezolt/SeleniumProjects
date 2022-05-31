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
			
		driver.get("http://the-internet.herokuapp.com/horizontal_slider");
		 int x = 10;
		   WebElement slider = driver.findElement(By.cssSelector("input[type='range']"));
		   int width = slider.getSize().getWidth();
		   Actions act= new Actions(driver);
		   act.moveToElement(slider, ((width*x)/100), 0).click();
		   act.build().perform();
		   System.out.println(driver.findElement(By.cssSelector("span#range")).getText());
		   		   
			
	}
}



















