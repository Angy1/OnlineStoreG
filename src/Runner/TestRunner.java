package Runner;

import java.util.ArrayList;
import org.testng.TestNG;
import java.util.List;
//http://learn-automation.com/execute-failed-test-cases-using-selenium/
	
	
public class TestRunner {
	
	public static void main(String[]args)
	
	{
		
		TestNG runner=new TestNG();
		
		List <String> list=new ArrayList<String>();
		
		list.add("C:\\Users\\user\\ToolsQA\\OnlineStoreG\\test-output\\Default suite\\testng-failed.xml");
		
		runner.setTestSuites(list);
		
		runner.run();
		
	}

}
