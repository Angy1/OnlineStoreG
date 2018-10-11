/**
 * 
 */
package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author user
 *help == http://toolsqa.com/selenium-webdriver/page-object-pattern-model-page-factory/
 */
public class HomePageNew 
{

	 WebDriver driver;
	
	//constructor
	public HomePageNew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	   
    @FindBy(how=How.XPATH, using = "/html/body/div[1]/div[1]/div[2]/ul/li[3]/a/div[3]")
    WebElement posts_m;
  
    
    @FindBy(how=How.XPATH,using = "/html/body/div[1]/div[1]/div[2]/ul/li[3]/ul/li[2]/a")
    WebElement alEntries_m;
   
    
	 public void goToHomePage()
	 {	
		 
		 posts_m.click();
		 alEntries_m.click();
	 }
	 
}
