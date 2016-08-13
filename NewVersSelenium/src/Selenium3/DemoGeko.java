package Selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoGeko {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.gecko.driver","D:/Rakhi/New VersionSelenium/geckodriver-v0.9.0-win64/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://google.com");
	driver.quit();
}

}
