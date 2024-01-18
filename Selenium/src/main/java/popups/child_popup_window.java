package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_popup_window 
{
	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		// navigate to main page
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(3000);
	    Set<String> window_id = driver.getWindowHandles();
	    
	    Thread.sleep(3000);
	   
	    ArrayList<String> al=new ArrayList<String>(window_id);
	    Thread.sleep(5000);
	    driver.switchTo().window(al.get(1));
	    
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Training']")).click();
	    
	    driver.switchTo().window(al.get(0));
	    Thread.sleep(3000);
	    
	    driver.close();
	    
		
	}

}
