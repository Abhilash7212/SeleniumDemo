package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/login");
	driver.findElement(By.id("Email")).getAttribute("");
		
		
	}

}
