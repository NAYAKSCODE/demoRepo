package crm.com.sample1;

import org.testng.annotations.Test;

public class sample1Test {
@Test(groups ={"regressionSuite"})
	
	public void hello()
	{
	System.out.println("hello world");
	}
	
	@Test(groups ={"smokeSuite"})
	public void bye()
	{
		System.out.println("bye world");
	}
}
