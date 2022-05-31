import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class LocatorFireEdge {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  //something to show
		String name= "rahul";
		String password = getPassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys(name); //to type something
		driver.findElement(By.name("inputPassword")).sendKeys(password); //to type something
		driver.findElement(By.className("signInBtn")).click(); // to click
		
		Thread.sleep(1000); //wait for next page
		//get text from p
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//check
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello " + name + ",");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException{	
	
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000); //wait for next page
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.cssSelector("form p")).getText();
//		Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray= passwordText.split("'");//split the text into 2 part
		String password = passwordArray[1].split("'")[0];
		return password;
	}
		

}
