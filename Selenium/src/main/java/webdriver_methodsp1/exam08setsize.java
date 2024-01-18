package webdriver_methodsp1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam08setsize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		Dimension dim=new Dimension(800, 400);
		driver.manage().window().setSize(dim);
	}

}
