package time;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testing1234 {
	
		@Test
		public  void Google()
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\bhargavi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
		}
		}


