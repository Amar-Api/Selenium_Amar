package cars;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LabborghiniTest 
{
	@Test
	public void launch()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("Labborghini Website is Launched",true);
}
}
