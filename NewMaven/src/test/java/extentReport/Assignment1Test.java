package extentReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Assignment1Test {
@Test

public void launch()
{
	//we are fetching data from cmd prompt, like url, email and password
	//=====================================================================================
	String url= System.getProperty("url");
	Reporter.log(url,true);  
	String email= System.getProperty("email");
	String pwd= System.getProperty("password");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get(url);
	driver.findElement(By.partialLinkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys(email);
	driver.findElement(By.id("Password")).sendKeys(pwd);
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	//=======================================================================================
	
	TakesScreenshot ts= (TakesScreenshot) driver;
	String screenshot= ts.getScreenshotAs(OutputType.BASE64);
	
	
	// step 1: create an instance of ExtentSparkReporter
	ExtentSparkReporter spark= new ExtentSparkReporter("./Html_Report/AssignmentScreenshot");
	
	// step 2- create an instance ExtentReports
	ExtentReports extReport= new ExtentReports();
	
	// step 3- attach ExtentSparkReporter to ExtentReports
	extReport.attachReporter(spark);
	
	// step 4- create an instance of ExtentTest
	ExtentTest test= extReport.createTest("Assignmentscreenshot");
	
	// step 5- call log() to provide Status and Message
	test.log(Status.PASS, "Screenshot added to your report");
	
	//To add Screenshot into Report
	test.addScreenCaptureFromBase64String(screenshot);
	
	// step 6- call flush()
	extReport.flush();
	
	
}
}
