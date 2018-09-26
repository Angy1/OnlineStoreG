package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.HomePage;
import com.wordpress.Pages.LoginPage;

public class VerifyWordpressHomePage
{
   

	@Test
	public void verifyWordpressHomePage()
	{
        WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		
		
		LoginPage login = new LoginPage(driver);
		
		login.loginToWordpress("opensourcecms", "opensourcecms");
		
		
		
		HomePage home = new HomePage(driver);
		
		home.verifyHomePage();
		
		
		driver.quit();
		
	}
	
}
