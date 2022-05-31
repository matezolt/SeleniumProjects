import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		
		String text="Zoltan";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		
		//Alert is not HTML based  => coming from JavaScript
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		//context switched from browser to alert
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();   //ok
		
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();  //cancel
		
		
		

	}

}
