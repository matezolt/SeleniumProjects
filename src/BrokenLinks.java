import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//make a list of the links
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		SoftAssert ass = new SoftAssert(); 
		
		for(WebElement link: links) {
		
			//Step 1 - GetAttribute tied to url
			String url = link.getAttribute("href");
			//Java methods will call the URL and get the status
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect(); //start the connection
			
			//if Status code >400 then that url is not working
			int responseCode = conn.getResponseCode();		
			System.out.println(responseCode);		
			ass.assertTrue(responseCode<400, "The link with text "+ link.getText() +" is broken with the code " + responseCode);
			
//			Assert.assertTrue(false); //hard assertion		
			}
		
		ass.assertAll();  //to report the errors	
	}

}
