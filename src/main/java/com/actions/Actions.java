package main.java.com.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Actions {
	
	WebDriver driver;
	JavascriptExecutor je;
	
	public Actions(WebDriver driver) {
		this.driver = driver;
		je = (JavascriptExecutor) driver;
	}

	public void click(WebElement element) {
		element.click();
	}
	
	public void navigateTo(String url) {
		driver.get(url);
		
	}
	
	public void selectFromDropdown(WebElement dropdown, String value) {
		Select dd = new Select(dropdown);
		dd.selectByValue(value);
	}
	
	public void scrollToWebElement(WebElement element) {
		je.executeScript("arguments[0].scrollIntoView(true);",element);      
	}

}
