package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPagePojo extends com.report.BaseClass{
	
	
	
	public loginPagePojo(){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Sign In']")
	WebElement signin;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Sign In']")
	WebElement login_Button;
	
	@FindBy(xpath="//button[@class='btn buttonHeaderIcons ']")
	WebElement communicationlog_button;
	
	@FindBy(xpath="//span[text()='No communication happened so far']")
	WebElement no_communication_happened;
	
	@FindBy(xpath="(//span[text()='Outgoing'])[1]")
	WebElement communication_happened;

	public WebElement getSignin() {
		return signin;
	}
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin_Button() {
		return login_Button;
	}

	public WebElement getCommunicationlog_button() {
		return communicationlog_button;
	}

	public WebElement getNo_communication_happened() {
		return no_communication_happened;
	}

	public WebElement getCommunication_happened() {
		return communication_happened;
	}



}
