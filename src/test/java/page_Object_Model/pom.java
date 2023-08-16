package page_Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common_Functions.Common_Functions;
import locators.locators;

public class pom extends Common_Functions {
	
	private locators loc;
	
	public locators getLoc() {
		if (loc == null) {
			loc = new locators(driver);

		}
		return loc;
	}



	public pom(WebDriver driver) {
		this.driver = driver;

	}

}
