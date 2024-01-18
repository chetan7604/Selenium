package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_popup_window1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			// navigate to main page
			driver.get("https://skpatro.github.io/demo/links/");
			
			Thread.sleep(3000);
			
			driver.manage().window().maximize();
			// click on child popup new window
			driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
			
			Thread.sleep(2000);
			
			Set<String> window_ids = driver.getWindowHandles();
			// convert all info into arraylist
			ArrayList<String> w1=new ArrayList<>(window_ids);
			
			driver.switchTo().window(w1.get(1));
			
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			// click on child window element
			driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
			
			Thread.sleep(3000);
			// navigate to main window
			driver.switchTo().window(w1.get(0));
			
		
			
		
	}
	

}
