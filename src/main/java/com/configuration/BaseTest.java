package com.configuration;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.keywords.UIKeywords;
import com.utils.PropertiesFile;

public class BaseTest {
	@BeforeMethod
	public static void openBrowerPlusURL() throws IOException {
		UIKeywords.openBrowser("CHROME");
		UIKeywords.maximizeWindow();
		String appurl = PropertiesFile.getValue("app-url");
		UIKeywords.launchURL(appurl);
		

	}
	//@AfterMethod
	public static void closeBrowser() {
		UIKeywords.closeBrowser();

	}

}
