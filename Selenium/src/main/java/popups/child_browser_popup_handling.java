package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup_handling 
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		// navigate to main page
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
	    // click on element to open child pop up/ tab/ window
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		Thread.sleep(3000);
	    //String id = driver.getWindowHandle();                //for single tab/window
	    
		Set<String> multiple_ids = driver.getWindowHandles();  //for multiple tab/window
		Thread.sleep(2000);
	
	    // convert all info into arraylist
		
		ArrayList<String> al=new ArrayList<String>(multiple_ids);
		driver.switchTo().window(al.get(1));
		Thread.sleep(3000);
		
		  // click element in pop up
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));
		
		driver.close();
	}

}
