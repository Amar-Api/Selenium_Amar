package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GithHubProject {
		@Test
		public void launch() {
			Reporter.log("Sample Class Launched in GitHub", true);
			Reporter.log("Modified", true);
		}
	
}
