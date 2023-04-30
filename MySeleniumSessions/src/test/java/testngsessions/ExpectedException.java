package testngsessions;

import org.testng.annotations.Test;

public class ExpectedException {
	
	
	@Test (expectedExceptions = ArithmeticException.class)
	public void calTest() {
		System.out.println("cal test ");
		
		int i = 9/0;
	}

}
