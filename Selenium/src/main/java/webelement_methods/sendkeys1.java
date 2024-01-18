package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");

	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com");
	    Thread.sleep(3000);
	    driver.manage().window().maximize();
	    
	   WebElement usern = driver.findElement(By.xpath("//input[@type='text']"));
	    
	  Thread.sleep(3000);
	 System.out.println( usern.isSelected());
	    
	    
		
	}

}
