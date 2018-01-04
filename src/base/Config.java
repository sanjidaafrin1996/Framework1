package base;


import utils.WebDriverApi;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class Config extends WebDriverApi{

	
// this is the configuration class
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browserName){
		//APPLICATION_LOGS.debug("TEST Suite S-T-A-R-T");
		if(browserName.equalsIgnoreCase("ch")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Users/SanjidaAfrin/Desktop/chromedriver");
			driver=new ChromeDriver();
			//APPLICATION_LOGS.debug("Chrome browser started");
			
		}
		else if (browserName.equalsIgnoreCase("ff")){
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Users/SanjidaAfrin/Desktop/geckodriver");
		driver=new FirefoxDriver();
		// APPLICATION_LOG.debug("firefox browser started");
		 
		}
		
		//driver.get("https://www.facebook.com");
		//APPLICATION_LOGS.debug("Facebook opend");
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		
	//@AfterTest
	//public void teardown(){
	//	System.out.println(driver.getTitle());
	driver.quit();
		//APPLIATION_LOG.debug("test suite e-n-d");
}
}

	
	

		
		



