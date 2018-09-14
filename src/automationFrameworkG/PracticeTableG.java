package automationFrameworkG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeTableG {

	public static void main(String[] args) {
		// Create a new instance for FirefoxDriver
				WebDriver driver = new FirefoxDriver();
				
				//Put an implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//Launch the URL
				driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
				
		        String dub_city = driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[2]")).getText();
				
				System.out.println(dub_city);
				
				//Click on the link
				driver.findElement(By.xpath("//*[@id=\"content\"]/table/tbody/tr[1]/td[6]/a")).click();
				System.out.println("Link has been clicked otherwise an exeption would have thrown");
				driver.close();


	}

}
