package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		//Implict wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		
		//explict wait 
		WebDriverWait Mywait=new WebDriverWait(driver,10);//explict wait
		
		Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']")));
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		WebDriverWait MyWait1=new WebDriverWait(driver,10);//explixt wait
		MyWait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		driver.close();
		
		
		//driver.findElement(By.xpath("//a[@id='welcome']")).click();
		//driver.findElement(By.linkText("Logout")).click();
		
		
	}

}
