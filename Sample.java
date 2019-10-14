import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
	   

		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project Path: "+ ProjectPath);
		System.setProperty("webdriver.gecko.driver", ProjectPath+ "\\Drivers\\GeckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.close();
		System.out.println("executed");
	}
	 
}
