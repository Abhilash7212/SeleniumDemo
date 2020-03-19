package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_hrm_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
//
//		driver.findElement(By.xpath("//a[@id='welcome']")).click();
//		driver.findElement(By.linkText("Logout")).click();
//		
		driver.findElement(By.xpath("//b[contains(text (),'Admin')]")).click();
	}

}
