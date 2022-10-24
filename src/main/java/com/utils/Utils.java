package main.java.com.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import main.java.com.base.Base;

public class Utils extends Base {

	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "//reports//" + testCaseName + "_"
				+ ThreadLocalRandom.current().nextInt() + ".png";
		FileUtils.copyFile(source, new File(destination));
		return destination;
	}
}
