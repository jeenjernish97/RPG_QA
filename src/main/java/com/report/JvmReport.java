package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	
	public static void jvmReportGenerate(String jsonpath ) {
		
		File f = new File(System.getProperty("user.dir")+"\\target\\JvmReports");
		
		Configuration con = new Configuration(f, "Facebook");
		con.addClassifications("Browser Name", "chrome");
		con.addClassifications("Platform Name", "windows");
		con.addClassifications("Browser version", "110");
		con.addClassifications("current Sprint", "4");
		
		List<String> li= new ArrayList<String>();
		li.add(jsonpath);
		
		ReportBuilder r = new ReportBuilder(li, con);
		r.generateReports();
		
	}

}
