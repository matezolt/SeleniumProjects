package test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNG {
	
	
	@Test
	public void method1() {
		System.out.println("Hello:Msg1");
	}

	@Test(groups={"Group1"})
	public void method2() {
		System.out.println("Bye:Msg2");
	}
	
	@BeforeTest
	public void method3() {
		System.out.println("I will execute first in this test class!!!: Msg3");
	}
}
