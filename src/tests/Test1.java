package tests;

import org.testng.annotations.Test;

import Value.Value1;
import base.Config;
import locators.Locators1;

public class Test1 extends Config {
	Locators1 loc = new Locators1();
	Value1 val = new Value1();
	
	@Test
	public void typeByXpath(){
		typeByXpath (loc.firstNameLocators, val.firstNameValue);
		typeByXpath (loc.lastNameLocators, val.lastNameValue);
		typeById(loc.newPasswordLocator, val.newPasswordValue);
		//typeByXpath (loc.yyDropdownLocators, val.yyDropdownValue);
		clickbyId(loc.femaleLocators);
		
		
		
		
		
		
		
		
	}
	

}
