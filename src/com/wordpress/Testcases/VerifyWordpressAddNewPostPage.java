package com.wordpress.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.wordpress.Pages.AddNewPostPage;
import com.wordpress.Pages.HomePage;
import com.wordpress.Pages.LoginPage;
import com.wordpress.Pages.PostPage;

public class VerifyWordpressAddNewPostPage {
	
	
	@Test
	public void verifyWordpressAddNewPostPage()
	{
		  WebDriver driver=new FirefoxDriver();
		  driver.manage().window().fullscreen();
		  driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");
		  
		  LoginPage login=new LoginPage(driver);
		  login.loginToWordpress("opensourcecms", "opensourcecms");
		  
		  HomePage home=new HomePage(driver);
		  home.goToHomePage();
		  
		  
		  PostPage post=new PostPage(driver);
		  post.clickOnAddNewButton();
		
		  AddNewPostPage addNewPage= new AddNewPostPage(driver);
		  addNewPage.writeNewPost();
		
		  driver.quit();
	}

}
