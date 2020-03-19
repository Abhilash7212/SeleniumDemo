	package learnSelenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j {

	private static Object title;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Logger log=Logger.getLogger(log4j.class);
		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		log.info("URL Launched");
		
		String title=driver.getTitle();
		System.out.println("Title is:"+title);
		log.warn("check title");
		
		if(title.equals("Google"))
		{
			System.out.println("correct website");
			log.info("The URL is correct");
		}
		else
		{
			System.out.println("incorrect website");
			log.error("The URL is not correct");
		}
		
	}

}
