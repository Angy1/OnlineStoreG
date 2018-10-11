/**
 * 
 */
package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author user
 *http://learn-automation.com/how-to-create-dependency-between-testcases-in-selenium/
 */
public class TestApplication {

	@Test
	public void testLogin()
	{
		Assert.assertEquals("Selenium", "Selnium");
		System.out.println("Login done");
		
	}
	
	@Test(dependsOnMethods= {"testLogin"})
	public void testAccount()
	{
		System.out.println("Account has been created");
		
	}
	
	@Test(dependsOnMethods= {"testLogin","testAccount"})
	public void testLogout()
	{
		System.out.println("Logout");
	}

}
