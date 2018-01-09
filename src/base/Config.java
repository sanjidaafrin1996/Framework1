package base;


import utils.WebDriverApi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class Config extends WebDriverApi{

	
// this is the configuration class
	@Parameters ("browser")
	@BeforeTest
	public void setUp(String browserName){
		APPLICATION_LOGS.debug("Test Suite S-T-A-R-T");
		if (browserName.equalsIgnoreCase("ch")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver");
			driver = new ChromeDriver();
			APPLICATION_LOGS.debug("Chrome Browser started");

		}
		else if (browserName.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Driver/geckodriver");
			driver = new ChromeDriver();
			APPLICATION_LOGS.debug("Firefox Browser started");
		}

		driver.get("https://www.facebook.com");
		APPLICATION_LOGS.debug("Facebook opend");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void tearDown (){
		//driver.quit();
		APPLICATION_LOGS.debug("Test Suite E-N-D");
	}
}

	
	

		
		



