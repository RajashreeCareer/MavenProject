package TestNGProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNGProgram {
	WebDriver driver;
	@Test(priority=1)
	public void openApp() {
		driver = new ChromeDriver();
	}
	
	@Test(priority=2)
	public void loginApp() {
		driver.get("https://testng.org/");	
	}
	
	@Test(priority=3)
	public void logoutApp() {
		driver.close();
	}

}
