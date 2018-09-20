package automationFrameworkG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTestCaseG {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		driver.manage().window().maximize();
		System.out.println("Hi!!!");
		
	

	}

}

