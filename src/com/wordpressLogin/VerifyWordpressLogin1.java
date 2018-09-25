/**
 * 
 */
package com.wordpressLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPage;

/**
 * @author user
 *http://learn-automation.com/page-object-model-using-selenium-webdriver/
 */
public class VerifyWordpressLogin1 {
	
	
	@Test
	public void verifyValidLogin()
	{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		LoginPage login = new LoginPage(driver);
		
		login.loginToWordpress("opensourcecms", "opensourcecms");
		
		driver.quit();
	}
}
