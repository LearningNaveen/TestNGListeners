package listenerTest;

import java.sql.Driver;

import org.testng.annotations.Test;

public class ParallelTest {

	// Below example is for implementing 
	@Test(threadPoolSize=3, invocationCount=2, timeOut=1000)
	public void Test1() {
		System.out.println("Inside Test1 " + Thread.currentThread().getId());
	}
	
	@Test
	public void Test2() {
		System.out.println("Inside Test2 "+ Thread.currentThread().getId());
	}
}
