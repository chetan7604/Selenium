package Arrow;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a1 
{
	public static void main(String[] args) throws InterruptedException 
	{
	       System.setProperty("webdriver.chrome.driver","G:\\java programme for testing\\New folder\\chromedriver.exe");

		
         WebDriver driver =new ChromeDriver();
   	    
   	    driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
   	    Thread.sleep(8000);
   	    
   	    driver.manage().window().maximize();
   	    
   	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,8000)");
   	     Thread.sleep(2000);
      	   
   	     
   	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-4000)");
	     Thread.sleep(5000);
	     
//	     WebElement ele = driver.findElement(By.xpath("//a[text()='Maliketh']"));
//	     Thread.sleep(3000);
//	     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
		
	}

}
