package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example8_navigate
{
	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		
		Thread.sleep(3000);
		driver.manage().window().maximize();

		driver.navigate().to("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
		
        driver.navigate().forward();
        
		Thread.sleep(3000);
		
        driver.navigate().refresh();
        
		
	
	}

}
