package webdriver_methodsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam07get_title 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
		
		String expected_title = "google";
		
		
		if(expected_title.equals(expected_title))
		{
		System.out.println("test pass");
		
		}
		else
		{
			System.out.println("test failed");
		}
	}

}
