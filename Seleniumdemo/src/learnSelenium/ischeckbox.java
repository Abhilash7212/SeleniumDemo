package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ischeckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		boolean checkpresence=driver.findElement(By.id("Email")).isDisplayed();
		System.out.println(checkpresence);
		
		boolean checkenable=driver.findElement(By.id("Email")).isEnabled();
		System.out.println(checkenable);
		if (checkpresence && checkenable==true)
		{
			driver.findElement(By.id("Email")).sendKeys("chennuriabhilashreddy@gmail.com");
			
			
		}
		
	}

}
