import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Grids {
	
	public static void main(String[] args) throws InterruptedException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		List<WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		
		for(int i=0; i<values.size(); i++) {
			sum +=  Integer.parseInt(values.get(i).getText());
			
		}
		System.out.println(sum);
		
		WebElement text = driver.findElement(By.className("totalAmount"));
		System.out.println(text.getText());
		int total = Integer.parseInt(text.getText().split(":")[1].trim());
		System.out.println(total);
		
		Assert.assertEquals(sum, total);
//		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//		
//		int sum = 0;
//		for(int i=0; i<values.size(); i++) {
//		
//			sum = sum +Integer.parseInt(values.get(i).getText());
//							
//		}
//		System.out.println(sum);
//		driver.findElement(By.cssSelector(".totalAmount")).getText();
//		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//		
//		Assert.assertEquals(sum, total);

}
}
