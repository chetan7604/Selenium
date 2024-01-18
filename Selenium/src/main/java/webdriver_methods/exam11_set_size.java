  package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam11_set_size 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		driver.get("https://www.google.com");
		
	    Dimension dim=new Dimension(400, 400);
	    
		driver.manage().window().setSize(dim);
	
		
	}

}
 