package demo3;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//http://learn-automation.com/how-to-create-log-files-in-selenium/
//https://www.youtube.com/watch?time_continue=395&v=Xk9fzXCX61U

public class Log4j {

	public static void main(String[] args) {
		
		Logger  logger = Logger.getLogger("LogDemo");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriver driver = new FirefoxDriver();
		logger.info("Firefox opened");
		
		driver.manage().window().fullscreen();
		logger.info("Brows maximized");
		
		//Put an implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Put an implicit wait");
		
		//Launch the URL
		driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		logger.info("Launch the URL");
		
        String dub_city = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")).getText();
		logger.info("Find element.Get text.");
		
		System.out.println(dub_city);
		logger.info("Print text");
		
		//Click on the link
		driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a")).click();
		logger.info("Click on the link");
		
		System.out.println("Link has been clicked otherwise an exeption would have thrown");
		logger.info("Print text:Link has been clicked otherwise an exeption would have thrown");
		
		driver.close();
		logger.info("Close LogDemo");

		

	}

}
