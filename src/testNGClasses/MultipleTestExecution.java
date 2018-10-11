/**
 * 
 */
package testNGClasses;

import org.apache.log4j.lf5.viewer.categoryexplorer.TreeModelAdapter;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author user
 *http://learn-automation.com/parallel-execution-in-selenium/
 */


public class MultipleTestExecution
{

	@Test
	public void setUp()
	{
		//This will write the log in HTML and on console as well
		Reporter.log("Test1 is executed via Thread and Thread Id is " + Thread.currentThread().getId(), true);
		
		System.out.println("SETUP");
	}
	
	
	@Test
	 public void loginApplication()
	 {
		 Reporter.log("Test2 is executed via Thread and Thread Id is " + Thread.currentThread().getId(), true);
	 
		 System.out.println("LOGINApplication");
	 }
	
	
	@Test
	public void logoutApplication()
	{
		Reporter.log("Test3 is executed via Thread and Thread Id is " + Thread.currentThread().getId(), true );
	
		System.out.println("LOGOUTApplication");
	
	}
}
