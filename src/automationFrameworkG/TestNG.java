package automationFrameworkG;

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterMethod;


	public class TestNG {
		
	  public WebDriver driver;

	  @Test
	  	public void main() {
		  
		  //Find element by id="account" and click
		  driver.findElement(By.id("account")).click();
		  
		  //Find the element that id is log
		  //Enter username on the element
		  driver.findElement(By.id("log")).sendKeys("Ann");
		  
		  //Find element that id is pwd
		  //Enter password
		  driver.findElement(By.id("pwd")).sendKeys("As544dd!21");
		  
		  //Find element that id is login and click
		  driver.findElement(By.id("login")).click();
		  
		  System.out.println("Login a sucessfully, now time is log off");
		  
		  //Find element that ID attribute is "account_logout"
		  driver.findElement(By.id("account_logout"));
		 
	  }	  
	  @BeforeMethod
	  public void beforeMethod() {
		  
		  //Create a new instance of the Firefox driver
		  driver = new FirefoxDriver();
		  
		  //Put an implicit wait, this means that any search for elements on the page
		  //could take the time the implicit wait is set for before throwing exception
		  driver.manage().window().fullscreen();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		  //Launch to Online Store Website
		  driver.get("http://store.demoqa.com/");
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  
		  driver.quit();
	  }

	}



