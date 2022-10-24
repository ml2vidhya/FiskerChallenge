package main.java.com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	// All objects should be defined here
	private By menuBtn = By.cssSelector("a[id='menu-toggle']");
	private By login = By.cssSelector("a[href*='login']");
	private By title = By.cssSelector("h1");
	private By footer = By.cssSelector("footer");
	
	private By hamburgerMenu  = By.id("nav-hamburger-menu");
	private By seeAllMenuItem = By.cssSelector("a[class='hmenu-item hmenu-compressed-btn']");
	private By computerMenuItem = By.cssSelector("a[data-menu-id='16']");
	private By monitorMenuItem = By.linkText("Monitors");
	
	// All methods should be defined here
	public WebElement getHamburgerMenu() {
		return driver.findElement(hamburgerMenu);
	}
	
	public WebElement getSeeAllMenuItem() {
		return driver.findElement(seeAllMenuItem);
	}
	
	public WebElement getComputerMenuItem() {
		return driver.findElement(computerMenuItem);
	}
	
	public WebElement getMonitorMenuItem() {
		return driver.findElement(monitorMenuItem);
	}
	
	public WebElement getMenuBtn() {
		return driver.findElement(menuBtn);
	}
	
	public WebElement getLogin() {
		return driver.findElement(login);
	}
	
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	
	public WebElement getFooter() {
		return driver.findElement(footer);
	}

}
