package com.wordpress.Pages;

import java.sql.Driver;

import javax.swing.text.Position.Bias;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewPostPageNew {
	
   WebDriver driver;
 
 	public AddNewPostPageNew (WebDriver ldriver)
 	{
 		this.driver= ldriver;
 	}
	 
    @FindBy(how=How.ID, using = "title")
    WebElement title_a;
    
    @FindBy(how=How.XPATH, using = "//*[@id=\"content_ifr\"]")
    WebElement  content_a;
    
    @FindBy(how=How.ID, using = "publish")
    WebElement publish_a;
    
    
    
    public void writeNewPost()
    {
    	title_a.sendKeys("New post");
    	content_a.sendKeys("This is a new post");
    	publish_a.click();
    }
    
    
}
