package test.java.com.cases;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import main.java.com.actions.Actions;
import main.java.com.base.Base;
import main.java.com.pageObjects.HomePage;
import main.java.com.pageObjects.ItemPage;
import main.java.com.pageObjects.MonitorPage;

public class AmazonTest extends Base {
	
	public WebDriver driver;
	private Actions actions;
	private Logger log;
	
	//Page Objects
	private HomePage hp;
	private MonitorPage mp;
	private ItemPage ip;
	
	@BeforeTest
	public void initialize() throws IOException {
		
		driver = initializeDriver();
		log = LogManager.getLogger(AmazonTest.class.getName());
		
		log.info("Driver is initialized.");
		actions = new Actions(driver);
		
		hp = new HomePage(driver);
		mp = new MonitorPage(driver);
		ip = new ItemPage(driver);
	}

	@Test
	public void GetSecondHighestPriceMonitorItemDetails () throws InterruptedException {
		
		log.info("Test Start");
		actions.navigateTo("https://www.amazon.com");
		
		actions.click(hp.getHamburgerMenu());
		
		actions.scrollToWebElement(hp.getSeeAllMenuItem());

		actions.click(hp.getSeeAllMenuItem());
		
		actions.click(hp.getComputerMenuItem());
		
		actions.click(hp.getMonitorMenuItem());
		
		actions.click(mp.getLGMonitorLink());
		
		actions.selectFromDropdown(mp.getSortSelect(), "price-desc-rank");

		actions.click(mp.getItemByIndex(2).findElement(By.tagName("a")));
		
		log.debug("Check if Product Description section is available");
		Assert.assertTrue(ip.getProductDescription().isDisplayed());
		
		log.debug("Get the Details of the Product");
		log.info("Item Name : " + ip.getItemTitle().getText());
		log.info("Item Description : " + ip.getProductDescription().getText());
		log.info("Item Price : " + ip.getItemPrice().getText());

		log.info("Test Success");		

	}
	


	@AfterTest
	public void teardown() {
		driver.close();
		log.info("Driver is closed");
	}
}
