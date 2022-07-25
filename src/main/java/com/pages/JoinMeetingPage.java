package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JoinMeetingPage {
	
	@FindBy(xpath="//a[text()=\" Join Meeting \"]")
	WebElement joinMeeeting1Lnk;
	@FindBy(css="input#username")
	WebElement userName;
	@FindBy(css="input#meetingid")
	WebElement meetingID;
	@FindBy(css="button#before_start")
	WebElement joinMeeting2Lnk;
	
	public void clickOnjoinMeeting1Lnk() {
		joinMeeeting1Lnk.click();

	}
	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
	public void enterMeetingID(String id) {
		meetingID.sendKeys(id);

	}
	public void clickOnJOinM2() {
		joinMeeting2Lnk.click();
	}
	
	
	

}
