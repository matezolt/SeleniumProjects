import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Training1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//alert
//		driver.findElement(By.id("name")).sendKeys("Zoltan");
//		driver.findElement(By.id("alertbtn")).click();
//		driver.switchTo().alert().accept();
//		System.out.println(driver.switchTo().alert().getText());
		//select
//		driver.findElement(By.cssSelector("select#dropdown-class-example")).click();
//		WebElement staticDropdown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
//		Select dropdown = new Select(staticDropdown); //Select class has several methods
//		dropdown.selectByIndex(1);
//		System.out.println(dropdown.getFirstSelectedOption().getText());
//		dropdown.getFirstSelectedOption().click();
//		dropdown.selectByVisibleText("Option3");
		
		driver.findElements(By.xpath("//input[@type='radio']")).get(2).click();
		
		
	}

}
