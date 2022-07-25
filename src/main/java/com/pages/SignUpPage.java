package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.keywords.UIKeywords;

public class SignUpPage {
	
	@FindBy(xpath = "//a[text()=\" Sign Up \"]")
	public static WebElement SIGNUPlnk;
	@FindBy(css="input#name")
	public static WebElement nameLnk;
	@FindBy(css="input#company_name")
	public static WebElement CompanynameLnk;
	@FindBy(css="input#email")
	public static WebElement EmailLnk;
	@FindBy(css="input#contact")
	public static WebElement mobilLnk;
	@FindBy(css="input#password")
	public static WebElement passwordLnk;
	@FindBy(xpath="//button[text()=\" Sign Up \"]")
	public static WebElement SignupLnk;
	
	
	public void clickonSIGNUP() {
		SIGNUPlnk.click();

	}
	
	public void enterName(String name) {
		nameLnk.sendKeys(name);

	}
	public void enterCompanyName(String companyname) {
		CompanynameLnk.sendKeys(companyname);

	}
	public void enterEmail(String email) {
		EmailLnk.sendKeys(email);

	}
	public void enterMobileNo(String mobilenum) {
		mobilLnk.sendKeys(mobilenum);

	}
	public void enterPassword(String password) {
		passwordLnk.sendKeys(password);

	}
	public void clickOnSignUp() {
		SignupLnk.click();

	}
	

}
