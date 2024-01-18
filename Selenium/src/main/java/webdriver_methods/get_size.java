package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_size
{

	public static void main (String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		Dimension d = driver.manage().window().getSize();
		
		Thread.sleep(3000);
		
		System.out.println(d);
		
		driver.close();
		
		
	}

}
