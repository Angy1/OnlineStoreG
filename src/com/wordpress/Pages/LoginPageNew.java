package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author user
 *http://learn-automation.com/page-object-model-using-selenium-webdriver/
 */

  public class LoginPageNew 
  {
	  
	 WebDriver driver; 
	//This is a constructor,as every page need a base driver to find web element
	public LoginPageNew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
    @FindBy(id="user_login")
   // @CacheLookup
    WebElement username;
    
    @FindBy(how=How.ID,using="user_pass")
   // @CacheLookup
    WebElement password;
    
    @FindBy(how=How.XPATH,using="//*[@id=\"wp-submit\"]")
    //@CacheLookup
	WebElement submit_button;
    
   /* @FindBy(how=How.LINK_TEXT,using="Lost your password?")
    @CacheLookup
    WebElement forget_password_link;
    */
    
    public void login_wordpress(String uid,String pass)
    {
    	username.sendKeys(uid);
    	password.sendKeys(pass);
    	submit_button.click();
    	//forget_password_link.click();
    }
    
    
  /*  public void clickOnLoginButton()
    {
    	submit_button.click();
    }*/
  }
