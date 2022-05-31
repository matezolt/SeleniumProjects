import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //get site
		
		//Calendar
		//		.ui-state-default ui-state-highlight
		driver.findElement(By.cssSelector(".ui-state-default ui-state-highlight")).click();
		
	}

}
