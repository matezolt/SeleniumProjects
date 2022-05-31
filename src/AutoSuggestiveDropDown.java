import java.util.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise"); //URL in the browser
		
		driver.findElement(By.id("autosuggest")).sendKeys("dub");  //provide input
		Thread.sleep(1000);
														//store all the options in a list
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option :options) {
			if(option.getText().equalsIgnoreCase("India")) {  //use get text to get the final value
				option.click();
				break;
			}
			
		}
	}

}
