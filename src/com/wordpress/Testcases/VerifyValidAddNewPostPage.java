package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.wordpress.Pages.AddNewPostPageNew;
import com.wordpress.Pages.HomePageNew;
import com.wordpress.Pages.LoginPageNew;
import com.wordpress.Pages.PostPageNew;

import Helper.BrowserFactory;

public class VerifyValidAddNewPostPage {
	
	
	@Test
	public void postNewPage()
	{  
		//This will launch browser and specific url
		WebDriver driver = BrowserFactory.startBrowser("firefox", "https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
	
		//Create a Page Object using Page Factory
		LoginPageNew login_page=PageFactory.initElements(driver, LoginPageNew.class);
		HomePageNew home_page=PageFactory.initElements(driver, HomePageNew.class);
		PostPageNew post_page=PageFactory.initElements(driver, PostPageNew.class);
		AddNewPostPageNew add_newPostPage=PageFactory.initElements(driver, AddNewPostPageNew.class);
		
		//call the method
		login_page.login_wordpress("opensourcecms", "opensourcecms");
		
		home_page.goToHomePage();
		
		post_page.clickOnAddNewButton();
		
		add_newPostPage.writeNewPost();
		
		driver.quit();
		
	}
}
