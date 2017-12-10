package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class PriorityList {
	
	@BeforeMethod
	public <WebDriver> void beforemethod(){
		System.setProperty("webdriver.chrome.driver","/Users/SanjidaAfrin/workspace/Framework1/drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();


		//C:\\Users\\Hasan\\workspace\\Spring17Framework\\drivers\\chromedriver.exe");
       //("https://www.facebook.com/");
	}

}
