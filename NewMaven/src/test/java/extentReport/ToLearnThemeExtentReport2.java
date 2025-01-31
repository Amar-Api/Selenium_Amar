package extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnThemeExtentReport2
{
	 public static void main(String[] args) {
	        // Step 1: Create ExtentReports instance
	        ExtentReports extent = new ExtentReports();

	        // Step 2: Create and configure ExtentSparkReporter
	        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("./Html_Report/SparkReport.html");
	        sparkReporter.config().setReportName("My Test Report");
	        sparkReporter.config().setDocumentTitle("Automation Test Results");
	        sparkReporter.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.DARK);

	        // Step 3: Attach SparkReporter to ExtentReports
	        extent.attachReporter(sparkReporter);

	        // Step 4: Log test cases
	        ExtentTest test = extent.createTest("Login Test");
	        test.pass("Step 1: Opened browser");
	        test.pass("Step 2: Logged in successfully");

	        // Step 5: Save the report
	        extent.flush();
	    }
}
