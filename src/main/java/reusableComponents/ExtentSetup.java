package reusableComponents;

import java.sql.Date;
import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectsRepo;

public class ExtentSetup extends ObjectsRepo{
	public static ExtentReports setupExtentReport() {
//		 ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReport.html");
		  ExtentReports extent = new ExtentReports();
//		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
//		@SuppressWarnings("deprecation")
//		Date date = new Date(0, 0);
//		String actualdate = format.format(date);
		 String dateFormat = "yyyy-MM-dd HH:mm:ss"; // Define your desired format
	        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
	        String formattedDate = sdf.format(new Date(0));
		
		String reportpath = System.getProperty("user.dir")+"/Reports/ExecutionReport_"+formattedDate+".html";
		ExtentSparkReporter spark = new ExtentSparkReporter(reportpath);
//		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
	    spark.config().setDocumentTitle("documentTitle");
	    spark.config().setTheme(Theme.DARK);
	    spark.config().setReportName("SparkReport");
	    return extent;
	    
		
	}

}
