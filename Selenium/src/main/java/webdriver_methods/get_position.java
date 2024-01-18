package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_position 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		Point pos = driver.manage().window().getPosition();
		
		System.out.println(pos);
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
