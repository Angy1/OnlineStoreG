/**
 * 
 */
package testNGDemo;

import org.testng.annotations.Test;

/**
 * @author user
 *http://learn-automation.com/how-to-create-dependency-between-testcases-in-selenium/
 */
public class TestMultiple
{

	@Test
	public void testLogin()
	{
		
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
