package learnSelenium;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement( By.xpath("//input[@placeholder='First Name']")).sendKeys("Abhilash");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("chennuri");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("aliganj,lucknow");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']")).sendKeys("chennuriabhilashreddy@gmail.com");
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']")).sendKeys("9999988888");
		
		
		//driver.findElement(By.xpath("//*[@name='radioptions' and @value='FeMale']")).click();

		driver.findElement(By.xpath("//label[1]//input[1]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Hindi')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click();
		Select dropdown=new Select(driver.findElement(By.id("Skills")));
		dropdown.selectByVisibleText("Adobe Photoshop");
		Select dropdownn=new Select(driver.findElement(By.id("countries")));
		dropdownn.selectByVisibleText("India");
		
		driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		//driver.findElement(By.xpath("//select[@id='country']//option[contains(text(),'Indonesia')]")).click();
		
		//driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
		driver.findElement(By.xpath("//select[@id='country']//option[contains(text(),'India')]")).click();

		driver.findElement(By.id("yearbox")).click();
		driver.findElement(By.xpath("//option[contains(text(),'1997')]")).click();;
		//driver.findElement(By.xpath("//option[contains(text(),'1996')]")).click();
	driver.findElement(By.xpath("//option[contains(text(),'August')]")).click();
	//driver.findElement(By.xpath("//select[@id='daybox']//option[contains(text(),'14')]")).click();
	driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Abhilash@1");
	driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Abhilash@1");
	driver.findElement(By.id("submitbtn")).click();
		
	//driver.findElement(By.xpath("//*[@id='checkbox2' and @value='Movies'")).click();
WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
Select sel6 = new Select(year);
	sel6.selectByValue("2001");
	List<WebElement>yearcount=sel6.getOptions();
	System.out.println(yearcount.size());
		for(int i=0;i<yearcount.size();i++){
			System.out.println(yearcount.get(i).getText());
			
		}
			
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel7 = new Select( month);
			sel7.selectByIndex(7);
			List<WebElement>monthcount=sel7.getOptions();
			System.out.println(monthcount.size());
				for(int i=0;i<monthcount.size();i++){
					System.out.println(monthcount.get(i).getText());
					
				}
				WebElement date=driver.findElement(By.xpath("//select[@id='daybox']"));
				Select sel8 = new Select( date);
					sel8.selectByIndex(20);
					List<WebElement>datecount=sel8.getOptions();
					System.out.println(datecount.size());
						for(int i=0;i<datecount.size();i++){
							System.out.println(datecount.get(i).getText());
							
						}
					
	
	
		//}
		
		//WebElement year=driver.findElement(By.xpath("//select[@placehoolder='Month']"));
		//Select sel3=new Select(year);
		//sel3.selectByIndex(2);
		

		//List<WebElement>yearcount=sel3.getOptions();
		//System.out.println(yearcount.size());
			//for(int i=0;i<yearcount.size();i++){
				//System.out.println(yearcount.get(i).getText());
				
			//}
		//driver.close();
	}
}


