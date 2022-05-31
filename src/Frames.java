import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/droppable/");
		//via index
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0); //may change the number of frames so should not be used
		//via Webelement
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		driver.findElement(By.id("draggable")).click();

		Actions action = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		action.dragAndDrop(source,target).build().perform();
		driver.switchTo().defaultContent(); // getting outside the frame to the normal page
		
		}	
}
