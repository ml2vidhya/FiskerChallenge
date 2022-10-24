package main.java.com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ItemPage {
	public WebDriver driver;
	
	public ItemPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By itemTitle = By.cssSelector("h1[id='title']");
	private By itemDescriptionRoot = By.id("productDescription_feature_div");
	private By itemDescription = By.id("productDescription");
	private By itemPriceRootElement  = By.cssSelector("div[id='corePrice_feature_div']");
	private By itemPriceElement = By.cssSelector("span[class='a-price-whole']");
	
	public WebElement getProductDescription() {
		return driver.findElement(itemDescriptionRoot).findElement(itemDescription);
	}
	
	public WebElement getItemTitle() {
		return driver.findElement(itemTitle);
	}
	
	public WebElement getItemPrice() {
		return driver
				.findElement(itemPriceRootElement)
				.findElement(itemPriceElement);
	}
}
