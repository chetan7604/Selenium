package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currenttitle 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");

	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com");
	    Thread.sleep(2000);
	    String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
}
