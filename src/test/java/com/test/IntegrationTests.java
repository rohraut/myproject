package com.test;

import java.io.IOException;

import org.checkerframework.checker.units.qual.mm2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.configuration.BaseTest;
import com.keywords.UIKeywords;
import com.pages.SignUpPage;
import com.pages.SigninPage;
import com.pages.WelcomePage;
import com.utils.PropertiesFile;

public class IntegrationTests extends BaseTest{
	@Test
	public static void m1() {
		WelcomePage sn = PageFactory.initElements(UIKeywords.driver,WelcomePage.class);
		sn.clickOnSigninLnk();

	}
	@Test
	public static void m2() throws IOException {
		WelcomePage wp = PageFactory.initElements(UIKeywords.driver,WelcomePage.class);
		wp.clickOnSigninLnk();
		String username = PropertiesFile.getValue("username");
		SigninPage sp = PageFactory.initElements(UIKeywords.driver, SigninPage.class);
		sp.enterUsername(username);
		String password = PropertiesFile.getValue("password");
		sp.enterPassword(password);
		sp.clickOnSignButton();
		
		

	}
	@Test
	public void m3() throws IOException {
		SignUpPage su = PageFactory.initElements(UIKeywords.driver,SignUpPage.class);
		su.clickonSIGNUP();
		String fullname = PropertiesFile.getValue("fullname");
		su.enterName(fullname);
		String compName = PropertiesFile.getValue("Company");
		su.enterCompanyName(compName);
		String email = PropertiesFile.getValue("Emailid");
		su.enterEmail(email);
		String mobil = PropertiesFile.getValue("mobileNo");
		su.enterMobileNo(mobil);
		String password = PropertiesFile.getValue("password");
		su.enterPassword(password);
		UIKeywords.waitForElement(5000);
		su.clickOnSignUp();
		

	}

}
