package webdriver_methodsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam06get_current_url 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String actual_url = driver.getCurrentUrl();
		
		System.out.println(actual_url);
		
		String expected_url="www.//google.com";
		
		if(expected_url.equals(expected_url))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test failed");
		}
		
	}

}
