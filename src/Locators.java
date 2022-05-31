import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException{
		
		//implicit wait - default value --> //Due to Timeout Issue element not displayed
		
		//Selenium wants to invoke chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		//Selenium should wait 5s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //something to show
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("zoltan"); //to type something
		driver.findElement(By.name("inputPassword")).sendKeys("zoltan"); //to type something
		driver.findElement(By.className("signInBtn")).click(); // to click
		
		//CSS Selector
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //extract the text from the page  
		driver.findElement(By.linkText("Forgot your password?")).click(); //select the text and click
		
		Thread.sleep(1000);  //1s wait trick Elementintercepted  changing state  // stabelize
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");	//find the Name field and put text
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");	//find the Email field and put text
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();	//clear the field based  on 2nd index
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");	//find the Email field and put text
		//via child-parent tags
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("+36-222222");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
//		System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText()); 
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	
	}
	

}









