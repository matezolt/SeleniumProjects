import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class LinksOpen {
	
	public static void main(String[] args) throws InterruptedException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Give me the count of the links on the page  - starts with <a
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Give me the links in the footer section - limit webdriver scope 
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));  //will focus only on the header
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		//Give me the links in 1 column of the footer section - limit webdriver scope 
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());		
		//Click on each link in the column and check if the pages are opening(links are working)
		for(int i=1;i<columnDriver.findElements(By.tagName("a")).size();i++){  //how many links are present
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);  //open in separate tabs via control and enter
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);   //first is retrieved
			
			Thread.sleep(5000L);
			
		}//open all the tabs
			Set<String> abc = driver.getWindowHandles(); 
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next()); //grab zero index in the set
				System.out.println(driver.getTitle()); 
								
			}
			
		}		
	

}
