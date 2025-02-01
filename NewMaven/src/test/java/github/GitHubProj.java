package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitHubProj {
	@Test
	public void launch() {
		
		Reporter.log("Modified in GitHub", true);
	}

}
