package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_get
{

public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
}
}
