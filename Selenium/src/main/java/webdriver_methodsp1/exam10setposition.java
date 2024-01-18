package webdriver_methodsp1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam10setposition 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.decathlon.com");
		
		Point p=new Point(300, 500);
		driver.manage().window().setPosition(p);
		
	}

}
