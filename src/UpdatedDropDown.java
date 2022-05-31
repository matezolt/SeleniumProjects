import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class UpdatedDropDown {
	
	public static void main(String[] args) throws InterruptedException{	
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
	//webdriver.chrome.driver -> value of the path
	WebDriver driver = new ChromeDriver();  
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //get site
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	int i=1;
	while(i<5) {
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	
	WebElement staticdrop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select select = new Select(staticdrop);
	select.selectByVisibleText("AED");
	System.out.println(select.getFirstSelectedOption().getText());
	
	
//	driver.findElement(By.id("divpaxinfo")).click();
//	Thread.sleep(1000);
//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//	int i = 1;
//	while(i<5) {
//		driver.findElement(By.id("hrefIncAdt")).click(); //5 adults selected
//		i++;
//	}
//	
//	driver.findElement(By.id("btnclosepaxoption")).click(); //done button 
//	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
//	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
	}
}
