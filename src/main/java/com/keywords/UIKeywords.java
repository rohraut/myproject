package com.keywords;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public static RemoteWebDriver driver = null;
	
	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else{
          System.out.println("invalid BrowserName");
		}

	}
	public static void launchURL(String url) {
		driver.get(url);
		

	}
	public static void maximizeWindow() {
		driver.manage().window().maximize();

	}
	public static void waitForElement() {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

	}
	public static void closeBrowser() {
		driver.close();

	}

}
