package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Htmldemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/jarfiles/tools.html");
		String tools=driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td[2]")).getText();
		System.out.println("The tool name is:"+tools);
		driver.close();
	}

}
