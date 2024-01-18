package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popup_handling1
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
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> tab_ids = driver.getWindowHandles();
		
		ArrayList<String> m1=new ArrayList<>(tab_ids);
		
		driver.switchTo().window(m1.get(1));
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Cypress'])[1]")).click();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
