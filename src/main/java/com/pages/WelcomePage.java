package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage {
	
	@FindBy(xpath="//a[text()=\" Sign In \"]")
	public static WebElement SigninLnk;
	
	public void clickOnSigninLnk() {
		SigninLnk.click();

	}

}
