package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class DashboardPage {
	
	@FindBy(css="input#upcoming_meeting_search_key")
	WebElement meetingIdLnk;
	@FindBy(css="input#upcoming_meeting_start_date")
	WebElement FromLnk;
	@FindBy(css="select.monthselect")
	WebElement SelectOptionLnk;
	@FindBy(xpath="(//td[text()=\"10\"])[1]")
	WebElement SelectDateOptionLnk;
	@FindBy(css="input#upcoming_meeting_end_date")
	WebElement ToLnk;
	@FindBy(xpath="(//select[@class=\"monthselect\"])[3]")
	WebElement SelectOptions2Lnk;
	@FindBy(xpath="(//td[text()=\"15\"])[3]")
	WebElement SelectDateOptionLnk2;
	@FindBy(xpath="(//span[text()=\" Schedule Meeting \"])[2]")
	WebElement ScheduleMlnk;
	@FindBy(css="input#edit_topic")
	WebElement TopicLnk;
	@FindBy(css="textarea#edit_description_1")
	WebElement DescriptionLnk;
	@FindBy(css="input.multiple_emails-input")
	WebElement InviteLnk;
	@FindBy(css="select[name=\"hour\"]")
	WebElement hourLnk;
	@FindBy(css="select[name=\"minute\"]")
	WebElement minuteLnk;
	@FindBy(css="input#req_meeting_password")
	WebElement passcodeLnk;
	@FindBy(xpath="(//span[@class=\"slider round\"])[1]")
	WebElement VideoLnk;
	@FindBy(css="input#submitmeeting")
	WebElement ScheduleMLnk;
	
	public void enterMeetingId(String id) {
		meetingIdLnk.sendKeys(id);

	}
	
	public void FromLnk() {
		FromLnk.click();
		Select s = new Select(SelectOptionLnk);
		s.selectByValue("9");
		SelectDateOptionLnk.click();
		
		
    }
	public void ClickToLink() {
		ToLnk.click();
		Select s = new Select(SelectOptions2Lnk);
		s.selectByVisibleText("Dec");
		SelectDateOptionLnk2.click();
		ScheduleMlnk.click();
		

	}
	public void enterTopic(String topic) {
		TopicLnk.sendKeys(topic);

	}
	public void enterDescription(String descrption) {
		DescriptionLnk.sendKeys(descrption);

	}
	public void enterInviteeName(String invitee) {
		InviteLnk.sendKeys(invitee);

	}
	public void setHours() {
		Select select = new Select(hourLnk);
		select.selectByValue("01");

	}
	public void setMinutes() {
		
		Select select = new Select(minuteLnk);
		select.selectByValue("30");
	}
	public void clickOnMeetingPasscode() {
		passcodeLnk.click();

	}
	public void clickOnVideoLnk() {
		VideoLnk.click();

	}
	public void clickOnScheduleMeeting() {
		ScheduleMLnk.click();

	}

}
