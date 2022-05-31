import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class SCSlider6 {

	public static void main(String[] args) throws InterruptedException, IOException{
		
	
		//Selenium wants to invoke chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		//Selenium should wait 5s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //something to show
			
		driver.get("http://automationpractice.com/index.php");
				
		driver.findElement(By.xpath("(//span[contains(text(),'Add to cart')])[2]")).click();
	
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
        String subWindowHandler = null;
        Set<String> handles = driver.getWindowHandles(); // get all window handles
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
		driver.findElement(By.cssSelector("(span[class*='ontin']")).click();
		driver.switchTo().window(parentWindowHandler);
		driver.findElement(By.cssSelector("div.box-cart-bottom div p#add_to_cart button")).click();
		driver.switchTo().window(subWindowHandler);		
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout']")).click();
		driver.switchTo().window(parentWindowHandler);
		driver.findElement(By.cssSelector("a[class*='checkout']")).click();
		driver.findElement(By.cssSelector("p[class*='checkbox']")).click();
		driver.findElement(By.cssSelector("a[title*='Add']")).click();
		
		driver.findElement(By.cssSelector("input[name*='firstname']")).sendKeys("Zeee");
		driver.findElement(By.cssSelector("input[name*='lastname']")).sendKeys("Maaai");
		driver.findElement(By.cssSelector("input[id='address1']")).sendKeys("King Street");
	
		WebElement staticDropdown = driver.findElement(By.id("id_state"));
		Select dropdown = new Select(staticDropdown); //Select class has several methods	
		dropdown.selectByVisibleText("Idaho");
		
		driver.findElement(By.cssSelector("input[id='postcode']")).sendKeys("44000");
		driver.findElement(By.cssSelector("input[id='phone']")).sendKeys("+36-3000000");
		driver.findElement(By.cssSelector("input[id='phone_mobile']")).sendKeys("+36-3000011");
		driver.findElement(By.cssSelector("input[id='alias']")).sendKeys("New Add");
		
		driver.findElement(By.xpath("//button[@id='submitAddress']")).click();
		
		WebElement staticDropdown2 = driver.findElement(By.id("id_address_delivery"));
		Select dropdown2 = new Select(staticDropdown2); //Select class has several methods	
		dropdown2.selectByVisibleText("New Add");
		
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='cgv']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='cgv']")).click();
		
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		
		driver.findElement(By.cssSelector("a[class*='bankwire']")).click();
		
		driver.findElement(By.cssSelector("p[id='cart_navigation'] button")).click();
		
	
		WebElement name = driver.findElement(By.cssSelector("div#center_column"));  //select the area for the screenshot
//		name.sendKeys(courseName);
		File file = name.getScreenshotAs(OutputType.FILE);  //Object of File class
		FileUtils.copyFile(file, new File("C:\\Users\\Eszti\\Selenium-Java\\Training\\logo.png"));//source file and destination
				
		
	}
}



















