package webdriver_methodsp1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.api.baggage.propagation.W3CBaggagePropagator;

public class exam02max_min 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.flipkart.com");
	    
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.manage().window().minimize();
	    
	}

}
