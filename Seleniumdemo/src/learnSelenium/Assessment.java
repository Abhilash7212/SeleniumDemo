package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assessment {

	private static String title;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com"); 
		
		String actual = driver.getTitle();	
		System.out.println(actual);

		String current=driver.getCurrentUrl();
		System.out.println(current);
		driver.close();
}

	private static void click() {
		// TODO Auto-generated method stub
		
	}
 
}
