package mavenpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoAMaven {

	@Test
	public void testA()
	{
		ExtentReports e = new ExtentReports("./extentReport.html");
		ExtentTest t = e.startTest("testA");
		t.log(LogStatus.PASS, "Hi-Bye");
		e.endTest(t);
		e.flush();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
	}
}
