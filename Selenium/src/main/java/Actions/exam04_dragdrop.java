package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class exam04_dragdrop 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement destinaton = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		Thread.sleep(2000);
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, destinaton).perform();
	}

}
