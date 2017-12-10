package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config<WebDriver> {
	
	
	public void setup(){
		System.setProperty("webdriver.chrome.driver","/Users/SanjidaAfrin/Desktop/chromedriver");
		 WebDriver driver=new ChromeDriver();
		
	        driver.get("https://www.facebook.com/");
		driver.
	}

}
