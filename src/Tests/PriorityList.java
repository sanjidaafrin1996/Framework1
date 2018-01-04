package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.WebDriverApi;

public class PriorityList {
	
	WebDriver driver;
	
	@BeforeMethod
	public  void beforemethod(){
		System.setProperty("webdriver.chrome.driver",System.getProperty("/Drivers/chromedriver"));
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 }
	@Test ()
	public void assertIfLOggedIn(){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("assert if user log in or not");
		
	}
	@Test ()
	public void loginFirst(){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("user should long in first");
		
	}
	@AfterMethod
	public void afterMethod (){
		ChromeDriver driver=new ChromeDriver();
		driver.close();
	driver.quit();
	

	}
}
