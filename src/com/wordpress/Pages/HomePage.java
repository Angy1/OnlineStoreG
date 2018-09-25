package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
 WebDriver driver;
	 
 By username = By.id("user_login");
 By password = By.xpath("//*[@id=\"user_pass\"]");
 By loginButton = By.name("wp-submit");
	 
	 
	 public HomePage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public void loginToWordpress(String userid, String pass)
	 {
		 driver.findElement(username).sendKeys(userid);
		 driver.findElement(password).sendKeys(pass);
		 driver.findElement(loginButton).click();
     }
	 
	 public String verifyHomePage()
	 {	
		 driver.findElement(By.id("menu-posts"));
		 
	     String title =driver.getTitle();
	     
	     return title;
		
	 }
	 
	 
	 
}