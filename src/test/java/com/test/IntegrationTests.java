package com.test;

import java.io.IOException;

import org.checkerframework.checker.units.qual.mm2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.configuration.BaseTest;
import com.keywords.UIKeywords;
import com.pages.ContactSalesPage;
import com.pages.DashboardPage;
import com.pages.JoinMeetingPage;
import com.pages.SignUpPage;
import com.pages.SigninPage;
import com.pages.WelcomePage;
import com.utils.PropertiesFile;

public class IntegrationTests extends BaseTest {
	@Test
	public static void m1() {
		WelcomePage sn = PageFactory.initElements(UIKeywords.driver, WelcomePage.class);
		sn.clickOnSigninLnk();

	}

	@Test
	public static void m2() throws IOException {
		WelcomePage wp = PageFactory.initElements(UIKeywords.driver, WelcomePage.class);
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
		SignUpPage su = PageFactory.initElements(UIKeywords.driver, SignUpPage.class);
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
		UIKeywords.waitForElement();
		su.clickOnSignUp();

	}

	@Test
	public static void m4() throws IOException {

		ContactSalesPage cs = PageFactory.initElements(UIKeywords.driver, ContactSalesPage.class);
		cs.clickOnContactSales();
		String name = PropertiesFile.getValue("name");
		cs.enterName(name);
		String email = PropertiesFile.getValue("Emailid");
		cs.enterEmail(email);
		String message = PropertiesFile.getValue("message");
		cs.enterMesage(message);
		cs.clickOnSendLnk();

	}
	@Test
	public static void m5() throws IOException {
		JoinMeetingPage jp = PageFactory.initElements(UIKeywords.driver,JoinMeetingPage.class);
		jp.clickOnjoinMeeting1Lnk();
		String id = PropertiesFile.getValue("MeetingID");
		jp.enterMeetingID(id);
		String name = PropertiesFile.getValue("name");
		jp.enterUserName(name);
		jp.clickOnJOinM2();

	}
	@Test
	public static  void m6() throws IOException {
		
		WelcomePage wp = PageFactory.initElements(UIKeywords.driver, WelcomePage.class);
		wp.clickOnSigninLnk();
		String username = PropertiesFile.getValue("username");
		SigninPage sp = PageFactory.initElements(UIKeywords.driver, SigninPage.class);
		sp.enterUsername(username);
		String password = PropertiesFile.getValue("password");
		sp.enterPassword(password);
		sp.clickOnSignButton();
		
		
		DashboardPage dp = PageFactory.initElements(UIKeywords.driver,DashboardPage.class);
		String id = PropertiesFile.getValue("MeetingID");
		dp.enterMeetingId(id);
		dp.FromLnk();
		dp.ClickToLink();
		
		
	}
	@Test
	public static void JoinMeetingModule() throws IOException {
		
		WelcomePage wp = PageFactory.initElements(UIKeywords.driver, WelcomePage.class);
		wp.clickOnSigninLnk();
		String username = PropertiesFile.getValue("username");
		SigninPage sp = PageFactory.initElements(UIKeywords.driver, SigninPage.class);
		sp.enterUsername(username);
		String password = PropertiesFile.getValue("password");
		sp.enterPassword(password);
		sp.clickOnSignButton();
		
		
		DashboardPage dp = PageFactory.initElements(UIKeywords.driver,DashboardPage.class);
		String id = PropertiesFile.getValue("MeetingID");
		dp.enterMeetingId(id);
		dp.FromLnk();
		dp.ClickToLink();
		String topic = PropertiesFile.getValue("topic");
		dp.enterTopic(topic);
		String description = PropertiesFile.getValue("description");
	     dp.enterDescription(description);
	    String name =  PropertiesFile.getValue("invites");
	     dp.enterInviteeName(name);
	     dp.setHours();
	     dp.setMinutes();
	     dp.clickOnVideoLnk();
	     //dp.clickOnMeetingPasscode();
	     dp.clickOnScheduleMeeting();
		

	}
	

}
