package utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtil {

	public static void takeScreenshot(WebDriver driver, String testName) {
	    try {
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        File dest = new File(System.getProperty("user.dir") + "/screenshots/" + testName + ".png");
	        FileHandler.copy(src, dest);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
    }
