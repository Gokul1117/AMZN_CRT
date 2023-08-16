package locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common_Functions.Common_Functions;

public class locators extends Common_Functions {
	
	@FindBy(id="twotabsearchtextbox")
	public WebElement search;
	
	@FindBy(id="nav-search-submit-button")
	public WebElement submit;
	
	@FindBy(xpath="//*[@class='a-size-base-plus a-color-base a-text-normal']")
	public WebElement bike;
	
	@FindBy(id="add-to-cart-button")
	public WebElement Addtocart;
	
	@FindBy(id="sw-gtc")
	public WebElement cartpage;
	
	@FindBy(className="a-truncate-cut")
	public WebElement ProductDetails;
	
	@FindBy(className="a-color-link")
	public WebElement SaveLater;
	
	@FindBy(className="a-button-input")
	public WebElement buynow;
	
	@FindBy (id="a-autoid-0-announce")
	public WebElement Quantity;
	
	@FindBy(id="quantity_2")
	public WebElement NumOFPiece;
	
	
	
	
	
	
	
	

	public locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
