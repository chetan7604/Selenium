package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Actions_all_method 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "G:\\java programme for testing\\New folder\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		
		WebElement Fashion = driver.findElement(By.xpath("(//div[@class='_3ETuFY'])[3]"));
		
		Actions ac=new Actions(driver);
		ac.moveToElement(Fashion).perform();
		Thread.sleep(6000);
		
	//	WebElement Home = driver.findElement(By.xpath("(//div[@class='_3ETuFY'])[3]"));
		
		ac.contextClick(Fashion).perform();
		Thread.sleep(2000);
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		ac.doubleClick(button).perform();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		Thread.sleep(2000);
		WebElement destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Thread.sleep(3000);
		ac.dragAndDrop(source, destination).perform();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		WebElement src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		Thread.sleep(2000);
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])"));
		Thread.sleep(3000);
		ac.clickAndHold(src).perform();
		Thread.sleep(2000);
		ac.moveToElement(dest).release().perform();
		Thread.sleep(3000);
		driver.close();
		
		
			
	}

}
