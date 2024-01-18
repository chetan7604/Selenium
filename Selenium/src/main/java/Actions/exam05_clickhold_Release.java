package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exam05_clickhold_Release 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");  
		
		driver.manage().window().maximize();
		Thread.sleep(3000);  
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Actions act=new Actions(driver);
		
		act.clickAndHold(source).perform();
		Thread.sleep(3000);
		
		act.moveToElement(dest).release().perform();
	
		
	
	}

}
