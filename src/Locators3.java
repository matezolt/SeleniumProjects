import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {
	
	//parentvs sibling 

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		//header/div/button[1]/following-sibling::button[1]
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//back to parent from sibling //header/div/button[1]/parent::div 
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());

	}

}
