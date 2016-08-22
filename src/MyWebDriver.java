import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class MyWebDriver {

	public static WebDriver mydriver;
	
	public static WebDriver getMydriver(){
		File pathBinary = new File("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);
		FirefoxProfile firefoxProfile = new FirefoxProfile();       
		mydriver = new FirefoxDriver(firefoxBinary, firefoxProfile);
		return mydriver;
	}
}
