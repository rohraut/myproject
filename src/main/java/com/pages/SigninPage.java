package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage {
	
	@FindBy(css="input#email")
	public static WebElement usernameLnk;
	@FindBy(css="input#password")
	public static WebElement passwordLnk;
	@FindBy(xpath="//button[text()=\" Sign In \"]")
	public static WebElement SigninLnk;
	
	public void enterUsername(String username) {
		usernameLnk.sendKeys(username);

	}
	public void enterPassword(String password) {
		passwordLnk.sendKeys(password);
		
	}
	public void clickOnSignButton() {
		SigninLnk.click();

	}

}
