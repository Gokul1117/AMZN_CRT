package test_Cases;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common_Functions.Common_Functions;
import page_Object_Model.pom;

public class Cart_Page extends Common_Functions {

	//Test_Case01
	//Add_to_Cart_TC	
	@Test
	public static void Add_to_cart() {
		driver.get(url);
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		pomobj.getLoc().submit.click();
		pomobj.getLoc().bike.click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));

		pomobj.getLoc().Addtocart.click();
		pomobj.getLoc().cartpage.click();
		System.out.println("The Add to cart Test case is Done= Pass");

	}

	// Test Case_02
	// product_details_check_TC
	@Test
	public static void product_details_check() {
		driver.get(url);
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		pomobj.getLoc().submit.click();
		pomobj.getLoc().bike.click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));

		pomobj.getLoc().Addtocart.click();
		pomobj.getLoc().cartpage.click();
		pomobj.getLoc().ProductDetails.click();

		System.out.println("product details Same=Pass");

		driver.quit();
	}
	
	// TestCase_03
	//Save_Later_TC
	@Test
	public static void Save_Later() {

		driver.get(url);	
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		pomobj.getLoc().submit.click();
		pomobj.getLoc().bike.click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));

		pomobj.getLoc().Addtocart.click();
		pomobj.getLoc().cartpage.click();
		pomobj.getLoc().SaveLater.click();

		System.out.println("Save Later is Done-Pass");
		driver.quit();

	}

	// Test_case_04
	//Proceed_to_buy_TC
	@Test
	public static void proceed_to_Buy() {

		driver.get(url);
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		pomobj.getLoc().submit.click();
		pomobj.getLoc().bike.click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));
		
		pomobj.getLoc().Addtocart.click();
		pomobj.getLoc().cartpage.click();
		pomobj.getLoc().buynow.click();

		System.out.println("proceed to buy is done=Pass");
		driver.quit();
	}
	
	// Test_case_05
	// Increasing_the_product_Quantity_TC
	@Test
	public static void Incresing_the_product_Quantity() {

		driver.get(url);
		pomobj.getLoc().search.sendKeys("toy house s1000 kids bike");
		pomobj.getLoc().submit.click();
		pomobj.getLoc().bike.click();

		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles2);
		driver.switchTo().window(list.get(1));

		pomobj.getLoc().Addtocart.click();
		pomobj.getLoc().cartpage.click();
		pomobj.getLoc().Quantity.click();
		pomobj.getLoc().NumOFPiece.click();
		System.out.println("Product Quantity check is Done=Pass");

		driver.quit();

	}

}
