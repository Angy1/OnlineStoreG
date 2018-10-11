package com.wordpress.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostPage {

 WebDriver driver;
	 
	 
	 By username = By.id("user_login");
	 By password = By.xpath("//*[@id=\"user_pass\"]");
	 By loginButton = By.name("wp-submit");
	
	 
	 public PostPage(WebDriver driver)
	 {
		 this.driver = driver;
	 }
	 
	 public void loginToWordpress(String userid, String pass)
	 {
		 driver.findElement(username).sendKeys(userid);
		 driver.findElement(password).sendKeys(pass);
		 driver.findElement(loginButton).click();
	 }
	 
	 public void clickOnLoginButton()
	 {
		 driver.findElement(loginButton).click();
	 }
	 
	 
	 public void goToHomePage()
	 {	
		 
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[3]/a/div[3]")).click();
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[3]/ul/li[2]/a")).click();
	 }
	 

	 
	 public void clickOnAddNewButton()
	 {
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/a")).click();
	 }
}
