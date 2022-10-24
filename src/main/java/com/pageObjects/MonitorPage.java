package main.java.com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MonitorPage {
	public WebDriver driver;
	
	public MonitorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By lgMonitorLink = By.linkText("LG");
	private By sortbySelect = By.id("s-result-sort-select");
	//private By getSecondItem = By.cssSelector("div[data-index='2']")
	
	public WebElement getLGMonitorLink() {
		return driver.findElement(lgMonitorLink);
	}
	
	public WebElement getSortSelect() {
		return driver.findElement(sortbySelect);
	}
	
	public WebElement getItemByIndex(int index) {
		By itemLocator = By.cssSelector("div[data-index='" + index + "']");
		return driver.findElement(itemLocator);
	}
	
	
}
