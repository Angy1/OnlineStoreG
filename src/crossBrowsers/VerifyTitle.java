package crossBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//http://learn-automation.com/cross-browser-testing-using-selenium-webdriver/

//!!! Chrome doesn't open all time in parallel tests!!!

public class VerifyTitle {
	
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void verifypageTitle(String browserName) {
		
		if (browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		 }
		 else if(browserName.equalsIgnoreCase("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\ToolsQA\\trunk\\Library\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		 }
		 else if(browserName.equalsIgnoreCase("IE"))
		 {
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\ToolsQA\\trunk\\Library\\drivers\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		 }
		driver.manage().window().maximize();
		driver.get("http://learn-automation.com");//http://store.demoqa.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
