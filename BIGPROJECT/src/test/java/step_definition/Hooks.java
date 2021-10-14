package step_definition;

import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import java.util.concurrent.TimeUnit;

public class Hooks {
	public static WebDriver webdriver;

	@Before
	public void openBrowser() throws MalformedURLException {
		System.out.println("Called openBrowser");
		ChromeOptions chromeOptions = new ChromeOptions();

		chromeOptions.addArguments("--disable-extensions");
		chromeOptions.addArguments("--disable-popup-blocking");
		chromeOptions.addArguments("--profile-directory=Default");
		chromeOptions.addArguments("--ignore-certificate-errors");
		chromeOptions.addArguments("--disable-plugins-discovery");

		chromeOptions.addArguments("user_agent=DN");
		chromeOptions.addArguments("user-data-dir=C:\\Users\\asus\\AppData\\Local\\Google\\Chrome\\User Data");	
//		chrome_options.addArguments("--profile-directory=Profile 1");
		
		String projectLocation = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectLocation + "\\lib\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Latihan Java Cilsy\\BIGPROJECT\\lib\\driver\\chromedriver.exe");
		webdriver = new ChromeDriver(chromeOptions);
		

		webdriver.manage().deleteAllCookies();
//		webdriver.manage().window().maximize();
		webdriver.get("https://staging.cicle.app/");
		webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}
}
