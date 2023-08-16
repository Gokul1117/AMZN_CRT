package common_Functions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import page_Object_Model.pom;


public class Common_Functions {
	public static String url;
	public static WebDriver driver;
	public static pom pomobj= new pom(driver);

	public static Properties properties;

	public static Properties Load_Property_file() throws IOException {

		FileInputStream fis= new FileInputStream("config.properties");

		properties=new Properties();

		properties.load(fis);

		return properties;

	}

	@BeforeMethod
	public static void Launch_browser() throws IOException {
        
		Load_Property_file();
		
		String browser=properties.getProperty("browser");
		
		 url=properties.getProperty("url");
		
		String driverLocation=properties.getProperty("driverlocation");

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("Webdriver.Chrome.driver", driverLocation);

			driver=new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			System.setProperty("Webdriver.Edge.driver", driverLocation);

			driver= new FirefoxDriver();
		}

		driver.manage().window().maximize();


	}

	@AfterMethod
	public static void Close_browser() {

		driver.quit();

	}


}
