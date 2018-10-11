/**
 * 
 */
package testNGDemo;

import org.testng.annotations.Test;

/**
 * @author user
 *http://learn-automation.com/group-test-cases-in-selenium/
 */
public class TestGroupDemo 

{
	@Test(groups= {"Smoke"})
	public void login()
	{
		System.out.println("Login done");
		System.out.println("Smoke scenario passed");
	}
	
	@Test(groups= {"Regression"})
	public void register()
	{
		System.out.println("Registration done");
	}
}
