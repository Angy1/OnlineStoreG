package com.wordpress.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PostPageNew
{

	 WebDriver driver;
	
	public PostPageNew(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH, using = "/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/a")
    WebElement addANewOne;
	
	 public void clickOnAddNewButton()
	 {
		 addANewOne.click();
	 }

}
