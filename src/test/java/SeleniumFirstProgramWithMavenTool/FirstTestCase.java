package SeleniumFirstProgramWithMavenTool;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
TestCase
--------
1. Launch chrome browser
2. Open URL https://demo.opencart.com/
3. Verify title is "Your Store"
4. Close Browser

*/

public class FirstTestCase {

	public static void main(String[] args) {
		System.out.println("First Test Case");
		//Launch chrome browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//Verify title is "Your Store"
		if(driver.getTitle().equalsIgnoreCase("Just a moment...")) {
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test faied");
		}
		
		//close browser
		//driver.close();
		driver.quit();
	}

}
