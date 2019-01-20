package listenerTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyzerTest {

	//@Test(retryAnalyzer = testNG_Listeners.RetryAnalyzer.class) //-----> When using the class/method level implementation.
	@Test
	public void Test1() {
		Assert.assertEquals(true,false);
	}
	
	//@Test(retryAnalyzer = testNG_Listeners.RetryAnalyzer.class) //-----> When using the class/method level implementation.
	@Test
	public void Test2() {
		Assert.assertEquals(true,false);
	}
}
