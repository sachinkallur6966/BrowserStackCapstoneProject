package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
	static WebDriver driver;
	public static WebDriver initDrivers(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			
		}
			else if(browserName.equalsIgnoreCase("fireFox"))
			{
				driver= new FirefoxDriver();
			}
			else if(browserName.equalsIgnoreCase("edge"))
			{
				driver= new EdgeDriver();
			}
			else {
				driver= new ChromeDriver();
			}
		return driver;
	}
	public static void quitDriver()
	{
		driver.quit();
	}
	

}
