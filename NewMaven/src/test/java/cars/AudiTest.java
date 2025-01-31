package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AudiTest 
{
	@Test
	public void launch()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.audi.com/en.html");
		Reporter.log("audi Website is Launched",true);
}
}
