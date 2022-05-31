import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class actionDemo {
	
	public static void main(String[] args) throws InterruptedException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		Actions action = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		//moves to specific element /(tick in mobiles)
		action.moveToElement(move).contextClick().build().perform();  //right click
	}
}
