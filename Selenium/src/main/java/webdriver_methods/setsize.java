package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");

	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    
	   Dimension dim=new Dimension(500, 300);
	   driver.manage().window().setSize(dim);
	   Thread.sleep(3000);
	   driver.quit();
	}
}
