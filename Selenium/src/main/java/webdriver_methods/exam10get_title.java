package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam10get_title 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	String actual_title = driver.getTitle();
	System.out.println(driver.getTitle());
	
	System.out.println(actual_title);
	
	String expected_title="Google";
	
	if(actual_title.equals(expected_title))
	{
		System.out.println("test pass");
		
	}
	else
	{
	System.out.println("test failed");
	}
			
	}

}
