package Webdriver_methodsp2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_browser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String actual_url = driver.getCurrentUrl();
		System.out.println(actual_url);
//		driver.navigate().to("https://www.facebook.com");
//		
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		driver.navigate().forward();
//		Thread.sleep(3000);
//		driver.navigate().refresh();

		Dimension dim=new Dimension(200,200);
		driver.manage().window().setSize(dim);
		Dimension d = driver.manage().window().getSize();
		System.out.println(d);
		Thread.sleep(5000);
		Point p=new Point(100, 50);
		driver.manage().window().setPosition(p);
		
		
	}

}
