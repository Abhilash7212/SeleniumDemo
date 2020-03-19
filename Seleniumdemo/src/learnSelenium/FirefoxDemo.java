package learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","E:\\jarfiles\\geckodriver-v0.26.0-win32\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/lo  gin");;
		
		
	}

}
