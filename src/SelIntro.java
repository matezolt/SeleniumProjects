import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntro{

	public static void main(String[] args) {
		// Invoke browser
		//Chrome - ChromeDriver -> Methods + class methods to run
		//WebDriver  - methods + class methods
		
		//Selenium wants to invoke chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  //interface 
		
		//Firefox Launch
		//geckodriver  / "webdriver.gecko.driver"
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Eszti\\Java Spring\\eclipse\\eclipse\\geckodriver.exe");
		WebDriver driver2 = new FirefoxDriver();
		
		//MS edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Eszti\\Java Spring\\eclipse\\eclipse\\msedgedriver.exe");
		WebDriver driver3 = new EdgeDriver();
		
		
		driver.get("https://www.nemzetisport.hu");
		System.out.println(driver.getTitle());  //Title check		
		System.out.println(driver.getCurrentUrl());  //Check current Url		
		driver.close(); //close the current window
		driver.quit(); //closing every associated window

	}

}
