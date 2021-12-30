package crm.com.sample1;

import org.testng.annotations.Test;

public class DummyTest {
@Test(groups= {"regressionSuite"})

	public void morning()
	{
		System.out.println("very good morning india");
	}
@Test(groups= {"smokeSuite"})
	public void night()
	{
		System.out.println(" good night india");
	}
}
