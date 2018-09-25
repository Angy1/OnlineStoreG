package ConfigurationDemo;

//Object Repository(if using to store locators)
//Property File(configuration file)
//http://learn-automation.com/object-repository-in-selenium-webdriver/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utility.ConfigReader;


public class TestSeleniuminChrome {
	
	ConfigReader config;
	
	@BeforeTest
	public void setUp()
	{
		config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		System.out.println("=======Setup Ready=====");
	}

	
	@Test
	public void testChrome() throws Exception
	{	
		System.out.println("=======Test Started=====");
	
	    WebDriver driver = new ChromeDriver();
	
	    driver.get(config.getApplicationUrl());
	    
	    driver.quit();
	    
	    System.out.println("=======Test Closed=====");
}
}
