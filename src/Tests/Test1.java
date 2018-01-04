package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Config;

public class Test1 extends Config {
	@BeforeMethod
	public void beforemethod(){
	String expvalue="sign up";
	String actvalue=driver.findElement(By.xpath("//*[@id='content']/div/div/div/div[2]/div[1]")).getText();
	
	try{
		Assert.assertEquals(false, true);
	}
	catch(Throwable y){
		System.out.println("act vs exp not matching"+y);
	}
		
		
	}
	@Test
	public void softassert(){
		Test1 softassert=new Test1();
		System.out.println("Test one started");
	   softassert.equals(softassert);
	   System.out.println("test complete");
	   softassert.softassert();
	
	}

}
