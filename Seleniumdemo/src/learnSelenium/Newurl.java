package learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newurl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/"); 
		String title=driver.getTitle();
		int length=title.length();
		System.out.println(title);
		System.out.println(length);
		String expurl=driver.getCurrentUrl();
		String acturl="http://demowebshop.tricentis.com/";
		if(acturl.equals(expurl))
		{
			System.out.println("Correct URL");
		}
		else{
			System.out.println("InCorrect URL");
				
		}
		String pagesource=driver.getPageSource();
			System.out.println(pagesource);
			int pglen=pagesource.length();
			System.out.println(pglen);
			driver.close();
	}

}
