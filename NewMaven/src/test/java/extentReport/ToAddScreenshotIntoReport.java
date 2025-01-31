package extentReport;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToAddScreenshotIntoReport 
{
	@Test
	public void addScreenShot() {
	    String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		TakesScreenshot TS = (TakesScreenshot) driver;
		String screenshot = TS.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./Html_Report/ScreenExtReport.Html");
		
	  //ExtentSparkReporter spark = new ExtentSparkReporter("./Html_Report/"+timestamp+"screen.html");
		
		ExtentReports extReport = new ExtentReports();
		extReport.attachReporter(spark);
		ExtentTest test = extReport.createTest("addscreenshot");
		test.log(Status.PASS, "Screenshot added into report");
		test.addScreenCaptureFromBase64String(screenshot);
		extReport.flush();
	}
}
