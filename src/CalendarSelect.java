import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		
		driver.manage().window().maximize();
		
		driver.get("https://www.path2usa.com/travel-companions");
		//April 14
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();  //click calendar field
		
		//select months from parent
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("June")) {
			
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
			
		List<WebElement> days = driver.findElements(By.className("day"));
		//grab common attribute // put into a list and iterate over
		int count = driver.findElements(By.className("day")).size();
		for(int i=0; i<count; i++) {
			String text = driver.findElements(By.className("day")).get(i).getText();
			if(text.equals("21")){
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
	}

}
