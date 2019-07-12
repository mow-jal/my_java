package restFramework;

import org.testng.annotations.Test;

public class RestTestClass {
	
	JsonRequestBuilder jsonBuilder = new JsonRequestBuilder();
	
	@Test
	public void test1() {
		 jsonBuilder.addWallet();
	}
}
