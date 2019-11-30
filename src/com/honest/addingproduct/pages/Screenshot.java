package com.honest.addingproduct.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {

	public void getScreenshot(WebDriver driver,String filePath) throws IOException {
		TakesScreenshot screen = ((TakesScreenshot)driver);
		File srcFile=screen.getScreenshotAs(OutputType.FILE);
		File destFile = new File(filePath);
		FileUtils.copyFile(srcFile, destFile);
	}
}
