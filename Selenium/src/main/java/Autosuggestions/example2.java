package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");

		
		WebDriver driver =new ChromeDriver();
	 	    
	 	driver.get("https://www.google.com/");
	 	Thread.sleep(2000);
	 	    
	 	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("one plus");
	 	Thread.sleep(2000);
	 	     
	 	List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	 	             
	 	      
	 	String exp_text = "oneplus 10";
	    for (WebElement option:alloptions)
	 	  {
	 	    String actual_text = option.getText();
	 	    	 
	 	    if(actual_text.equals(exp_text))
	 	      {
	 	    	option.click();
	 	    		break;
	 	    	 }
	 	      }
		
	}

}
