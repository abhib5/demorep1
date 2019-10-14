package TestNGdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class firstTestNGDemo {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "D:\\Edu Stuff\\Selenium\\Selenium Softs\\All Codes\\SeleniumJavaFramework\\Drivers\\GeckoDriver\\geckodriver.exe";
	public WebDriver driver ; 
	@Test
	public void verifyHomepageTitle() {

		System.out.println("launching firefox browser"); 
		System.setProperty("webdriver.gecko.driver", driverPath);
		//driver = new FirefoxDriver();
		driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);

	}
}


