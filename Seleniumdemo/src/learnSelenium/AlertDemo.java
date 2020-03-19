package learnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert=driver.switchTo().alert();
		String alertmessage=driver.switchTo().alert().getText();
	System.out.println(alertmessage);
	alert.accept();
	 Thread.sleep(3000);
	
	 driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();;
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	Alert alert0 = driver.switchTo().alert();
	String alert1=alert0.getText();
	System.out.println(alert1);
	alert0.dismiss();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();;
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Alert alert2=driver.switchTo().alert();
	alert2.sendKeys("Abhilash");
	alert2.accept();
	Thread.sleep(3000);
	driver.close();
	} 

}
