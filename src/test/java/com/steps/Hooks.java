package com.steps;

import com.report.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	@Before
	public void beforelaunch() {
		launchBrowser();
		tomaximize();
		toPassUrl("https://www.redbeltgym.com/login");
	}
	@After
	public void afterlaunch() {
		toQuit();
	}

}
