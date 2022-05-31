import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActivity {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		
		//maximized mode
		driver.manage().window().maximize();
		driver.get("http://google.com");  //components loads => fully load
		driver.navigate().to("https://rahulshettyacademy.com"); //=> not fully load
		driver.navigate().back();//back icon is selected
		driver.navigate().forward();//forward icon is selected
	}

}
