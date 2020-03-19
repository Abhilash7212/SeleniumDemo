package learnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Signin 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login"); 
		driver.manage().window().maximize();
	driver.findElement(By.id("Email")).sendKeys("chennuriabhilashreddy@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Abhilash");
driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
String expectedresult="Demo Web Shop";
String actualresult=driver.getTitle();
System.out.println(actualresult);
if(expectedresult.equals(actualresult))
{
System.out.println("correct page");
}else{
	System.out.println("incorrect page");
}
driver.findElement(By.className("ico-logout")).click();
	driver.close();
	}

}
