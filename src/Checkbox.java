import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//TestNg is one of the testing framework  => assertion


public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eszti\\eclipse\\chromedriver.exe");
		//webdriver.chrome.driver -> value of the path
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		//check if checkbox is selected
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		//count the number of checkboxes --> what is common locator for the elements to be selected
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		//enabled vs disabled
//		System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
		
	}

}
