package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactSalesPage {

	@FindBy(xpath = "//a[text()=\" Contact sales \"]")
	private static WebElement ContactLnk;

	@FindBy(css = "input[name=\"user_name\"]")
	private static WebElement NameLnk;
	@FindBy(css = "input[name=\"user_email\"]")
	private static WebElement emailLnk;
	@FindBy(css = "textarea[name=\"user_message\"]")
	private static WebElement textLnk;
	@FindBy(css = "button[type=\"submit\"]")
	private static WebElement SendLnk;

	public void clickOnContactSales() {
		ContactLnk.click();

	}

	public void enterName(String name) {
		NameLnk.sendKeys(name);

	}

	public void enterEmail(String email) {
		emailLnk.sendKeys(email);
	}

	public void enterMesage(String message) {
		textLnk.sendKeys(message);

	}

	public void clickOnSendLnk() {
		SendLnk.click();

	}

}
