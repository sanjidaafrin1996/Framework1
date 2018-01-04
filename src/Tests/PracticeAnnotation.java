package Tests;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PracticeAnnotation {
	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("run before all the test");
	}
	@AfterSuite
	public void aftersuite(){
		System.out.println("run after all the test have been run");
	}
	@Test
	public void aftermethod(){
		System.out.println("run before all the method which belongs to class");
	}

}
