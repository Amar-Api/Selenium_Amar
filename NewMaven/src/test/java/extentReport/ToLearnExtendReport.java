package extentReport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtendReport 
{
	@Test
	public void createReport() {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		// step 1: create an instance of ExtentSparkReporter
		ExtentSparkReporter spark = new ExtentSparkReporter("./Html_Report/ExtentReport.Html");
		//ExtentSparkReporter spark = new ExtentSparkReporter("./Html_Report/" + timestamp + "extent.html");
		
		// step 2- create an instance ExtentReports
		ExtentReports extReport = new ExtentReports();
		
		// step 3- attach ExtentSparkReporter to ExtentReports
		extReport.attachReporter(spark);
		
		// step 4- create an instance of ExtentTest
		ExtentTest test = extReport.createTest("createReport");
		
		// step 5- call log() to provide Status and Message
		test.log(Status.PASS, "Message added into report");
		test.pass("Message pass");
		
		// step 6- call flush()
		extReport.flush();
	}

}
