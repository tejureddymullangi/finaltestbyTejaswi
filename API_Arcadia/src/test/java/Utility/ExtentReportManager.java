package Utility;

import java.util.Date;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportManager {
	public static ExtentReports extentReportManager;
	public static ExtentTest extentTest;
	
	public static void createReport(String reportName) {

		Date date = new  Date();
		String time = date.getTime()+""; // getting time in milli sec
		extentReportManager = new ExtentReports(System.getProperty("user.dir")+"/target/data-output/"+reportName+"_"+time+".html");
		
	
	}
	
	public static void startTest(String testName) {
		extentTest = extentReportManager.startTest(testName);
	}
}
