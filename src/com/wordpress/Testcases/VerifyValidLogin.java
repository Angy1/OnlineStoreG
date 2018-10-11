package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.LoginPageNew;

import Helper.BrowserFactory;

public class VerifyValidLogin
{

	@Test
	public void checkValidUser()
	{
		
		//This will launch browser and specific url
		WebDriver driver=BrowserFactory.startBrowser("firefox", "https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		
		//Created Page Object using Page Factory
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class );
		
		//Call the method
		login_page.login_wordpress("opensourcecms", "opensourcecms");
		
		driver.quit();
	}
}
