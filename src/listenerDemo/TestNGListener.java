/**
 * 
 */
package listenerDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



/**
 * @author user
 *http://learn-automation.com/what-is-testng-listener-and-how-to-implement-in-selenium/
 */
	 
public class TestNGListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		
		
	}

	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("TestCase Success Huryyyy and details TestCase are " + result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("TestCases failed and details TestCase are " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
		System.out.println("TestCase Skipped and details TestCase are " + result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext result) {
		
		System.out.println("TestCase Started and TestCase details are " + result.getName());	
	}

	@Override
	public void onFinish(ITestContext context) {
		
		
	}

}
