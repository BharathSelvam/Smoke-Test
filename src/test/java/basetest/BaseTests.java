package basetest;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.pages.LoginPage;
import com.utilities.ReadProperties;

public class BaseTests {
	protected WebDriver driver;
	protected LoginPage loginpage;
	Properties properties;

	@BeforeMethod
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		properties = ReadProperties.readProperties(); // For reading the data from test.properties file
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(properties.getProperty("URL"));
		loginpage = new LoginPage(driver);
	}

	@AfterMethod
	public void quitDriver() {
		driver.close();
		driver.quit();
	}
}
