package basetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.altavoz.pages.LoginPage;

public class BaseTests {
	protected WebDriver driver;
	protected LoginPage loginpage;

	@BeforeMethod
	public void initialize() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("");
		loginpage = new LoginPage(driver);

	}

	@AfterMethod
	public void quitDriver() {
		driver.close();
		driver.quit();
	}
}
