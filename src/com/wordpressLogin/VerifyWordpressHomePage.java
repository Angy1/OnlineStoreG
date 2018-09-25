package com.wordpressLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.HomePage;

public class VerifyWordpressHomePage
{
   

	@Test
	public void verifyWordpressHomePage()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		
		HomePage home = new HomePage(driver);
		
		home.verifyHomePage();
		//System.out.println("Home page title is " + title);
		
		driver.quit();
		
	}
	
}
