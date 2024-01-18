package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		  
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		
     	WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
    	driver.switchTo().frame(frame);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		 Thread.sleep(3000);
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
