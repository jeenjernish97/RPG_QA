package com.steps;

import org.junit.Assert;

import com.pages.loginPagePojo;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends com.report.BaseClass {

	String verify;
	loginPagePojo login;

	@When("user enters username {string}")
	public void userEntersUsername(String user) throws InterruptedException {
		login = new loginPagePojo();
		Thread.sleep(3000);

		// validate the signin page
		Assert.assertEquals("check sign in page", "Sign In", toGetText(login.getSignin()));
		// enter the user name
		toInput(login.getUsername(), user);
	}

	@When("user enters password {string}")
	public void userEntersPassword(String password) {
		// enter the password
		toInput(login.getPassword(), password);
	}

	@When("user clicks on Login button")
	public void userClicksOnLoginButton() {

		// click the login button
		toClick(login.getLogin_Button());
	}

	@When("navigated into communication log")
	public void navigatedIntoCommunicationLog() throws InterruptedException {
		// click communication log button
		Thread.sleep(10000);
		toClick(login.getCommunicationlog_button());
	}

	@Then("Some information should show that no communication happened")
	public void someInformationShouldShowThatNoCommunicationHappened() throws InterruptedException {
		// validate - no communication happened
		Thread.sleep(5000);
		Assert.assertEquals("check no communication happened", "No communication happened so far",
				toGetText(login.getNo_communication_happened()));
		toPrintText(login.getNo_communication_happened());
	}

	@When("user enter the value in username {string}")
	public void userEnterTheValueInUsername(String user) throws InterruptedException {
		login = new loginPagePojo();

		Thread.sleep(3000);
		Assert.assertEquals("check sign in page", "Sign In", toGetText(login.getSignin()));
		// enter the user name
		toInput(login.getUsername(), user);
	}

	@When("user enter the value in password{string}")
	public void userEnterTheValueInPassword(String password) {
		// enter the password
		toInput(login.getPassword(), password);
	}

	@When("user click the login button")
	public void userClickTheLoginButton() {
		// click login button
		toClick(login.getLogin_Button());
	}

	@When("navigated to communication log")
	public void navigatedToCommunicationLog() throws InterruptedException {
		// click communication log button
		Thread.sleep(10000);
		toClick(login.getCommunicationlog_button());
	}

	@Then("Some information should show that communication happened")
	public void someInformationShouldShowThatCommunicationHappened() throws InterruptedException {
		// validate some communication happened
		Thread.sleep(5000);
		Assert.assertEquals("check communication happened", "Outgoing", toGetText(login.getCommunication_happened()));
		toPrintText(login.getCommunication_happened());
	}

}
