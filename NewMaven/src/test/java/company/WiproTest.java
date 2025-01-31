package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WiproTest 
{
@Test
public void launch()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.wipro.com/");
	Reporter.log("Wipro Website is Launched",true);
}
}
