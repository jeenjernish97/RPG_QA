package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\featurefiles", glue = "com.steps", snippets = SnippetType.CAMELCASE, dryRun = false,
plugin= {"html:target",
		"json:target\\Reports\\fb.json","junit:target\\Reports\\login.xml"})
public class TestRunnerClass {

	
@AfterClass
	
	public static void afterclas() {
		JvmReport.jvmReportGenerate(System.getProperty("user.dir")+"\\target\\Reports\\fb.json");

	}
}
