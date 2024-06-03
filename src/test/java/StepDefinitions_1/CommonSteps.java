package StepDefinitions_1;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {

	private WebDriver driver;

//	@Before
//	public void Setup() {
//		driver = new ChromeDriver();
//		// ChromeOptions options = new ChromeOptions();
//		// System.out.print(options);
//
//	}
	@Before
	public void startBrowser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	}

	public void goToUrl(String url) {
		driver.get(url);
	}

	public String getCurrentPageUrl() {
		return driver.getCurrentUrl();
	}

	public String getCurrentPageTitle() {
		return driver.getTitle();
	}

	public WebDriver getDriver() {
		return driver;
	}

	@After
	public void quit() {
		driver.quit();

	}

}
