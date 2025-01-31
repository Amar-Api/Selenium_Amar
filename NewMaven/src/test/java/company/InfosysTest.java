package company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InfosysTest 
{
@Test
public void launched()
{
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.infosys.com/");
	Reporter.log("Infosys Website is Launched",true);
}
}
