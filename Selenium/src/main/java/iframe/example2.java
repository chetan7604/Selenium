package iframe;

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
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		WebElement frame = driver.findElement(By.xpath("(//iframe[@frameborder='0'])[2]"));
		
		driver.switchTo().frame(frame);
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Change Orientation']")).click();
		
		
		
	}

}
