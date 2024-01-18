package Autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws InterruptedException 
	{

        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(3000);
	   List<WebElement> alloptions = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
	    
	    String expected_text="redmi note 13 pro plus";
	    Thread.sleep(3000);
	    
	    for(WebElement option:alloptions)
	    {
	    	String actual_text = option.getText();
	    	System.out.println(actual_text);
	    	
	    	if(actual_text.equals(expected_text))
	    	{
	    		option.click();
	    		break;
	    	}
	    }
	  driver.close();
	}
	

}
