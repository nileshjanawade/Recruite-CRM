package resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportNg {
    static ExtentReports exReport;
    public static  ExtentReports getReportObject(){
        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("DemoQA Automation Result");
        reporter.config().setDocumentTitle("Reports");

        exReport = new ExtentReports();
        exReport.attachReporter(reporter);
        exReport.setSystemInfo("Nilesh J","Automation Tester");
        return exReport;
    }
}
