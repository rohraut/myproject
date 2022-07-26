package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.keywords.UIKeywords;

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
	@FindBy(xpath="(//td[text()=\"30\"])[5]")
	WebElement SelectDateOptionLnk2;
	@FindBy(xpath="(//span[text()=\" Schedule Meeting \"])[2]")
	WebElement ScheduleMlnk;
	
	public void enterMeetingId(String id) {
		meetingIdLnk.sendKeys(id);

	}
	
	public void ToLnk() {
		FromLnk.click();
		Select s = new Select(SelectOptionLnk);
		s.selectByValue("8");
		SelectDateOptionLnk.click();
		
		
    }
	public void ClickToLink() {
		ToLnk.click();
		Select s = new Select(SelectOptions2Lnk);
		s.selectByVisibleText("Dec");
		SelectDateOptionLnk2.click();
		ScheduleMlnk.click();
		

	}

}
