package Actions_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example01 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement all = driver.findElement(By.xpath("(//a[@class='_2KpZ6l _3dESVI'])[3]"));
		
		Actions ac1=new Actions(driver);
		
		ac1.moveToElement(all).perform();
		Thread.sleep(3000);
		
		WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
		
		//ac1.moveToElement(more).contextClick().perform();
		ac1.contextClick(more).perform();
		Thread.sleep(3000);
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		Thread.sleep(2000);
		WebElement dest = driver.findElement(By.xpath("//li[@class='placeholder']"));
		
		//ac1.dragAndDrop(src, dest).perform();
		ac1.clickAndHold(src).perform();
		Thread.sleep(3000);
		ac1.release(dest).perform();
		
		
		
		
		
	
		
		
		
		
		
	}
}
