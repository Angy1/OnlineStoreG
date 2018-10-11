package listenerDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class MyFirstTestCase
{
	
	@Test
	public void GoogleTitleVerify()
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.quit();
		
	}

	
	@Test
	public void TitleMatch()
	{
		
		System.out.println("Test 2 Dummy");
		Assert.assertTrue(false);
		
	}
}
