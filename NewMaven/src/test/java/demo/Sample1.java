package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test
	public void launch() {
		Reporter.log("Sample Class Launched", true);
	}
}
